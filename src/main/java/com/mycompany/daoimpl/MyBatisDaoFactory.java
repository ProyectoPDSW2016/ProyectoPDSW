/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoimpl;

import com.mycompany.persistencia.DaoEquipo;
import com.mycompany.persistencia.DaoFactory;
import com.mycompany.persistencia.PersistenciaException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Manuel Felipe Sanchez R
 * Esta clase se encarga de implementar el modelado de la clase 
 * DaoFactory para el framework de persistencia MyBatis
 * doc: http://www.mybatis.org/mybatis-3/es/
 */
public class MyBatisDaoFactory extends DaoFactory {
    private static volatile SqlSessionFactory sqlSessionFactory;
    private Properties  appProp = null;
    
      private SqlSession currentsessionsql;
    /*
      Constructor de la clase MyBatisDaoFacroty, 
      syncronized se encarga de ejecutar el codigo que tiene encerrado 
      para que solo pueda acceder un objeto a la vez a ejecutar la session.
     */
    public MyBatisDaoFactory(Properties p) {
        this.appProp = p;
     
        if (sqlSessionFactory == null) {
          synchronized(MyBatisDaoFactory.class){
              
          
           if (sqlSessionFactory==null){
                    sqlSessionFactory=getSqlSessionFactory(this.appProp); 
                }
        }
    }
        }
    /**
     * Construye un SQLSessionFactory usando el archivo de configuración de
     * MyBatis, el nombre está en el archivo de configuración de la aplicación.
     * @param appProp
     * @return SQLSessionFactory
     */
    private SqlSessionFactory getSqlSessionFactory(Properties appProp) {
        SqlSessionFactory sqlSessionFactory2 = null;
        if (sqlSessionFactory2 == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(appProp.getProperty("mybatis-config-file"));
                sqlSessionFactory2 = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sqlSessionFactory2;
    }  

    @Override
    public void beginSession() throws PersistenciaException{
       currentsessionsql = sqlSessionFactory.openSession();
    }

    @Override
    public DaoEquipo getDaoEquipo() {
        return new MyBatisDaoEquipo(currentsessionsql);
        
    }

    @Override
    public void commitTransaction() throws PersistenciaException{
        currentsessionsql.commit();
    }

    @Override
    public void rollbackTransaction() throws PersistenciaException  {
        currentsessionsql.rollback();
    }

    @Override
    public void endSession()  throws PersistenciaException
    {
       currentsessionsql.close();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoimpl;

import com.mycompany.persistencia.DaoEquipo;
import com.mycompany.persistencia.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import javax.persistence.PersistenceException;
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
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqls;
    
    public MyBatisDaoFactory() {
         sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis_electroECI.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override
    public void beginSession() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DaoEquipo getDaoEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commitTransaction() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rollbackTransaction() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endSession() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import java.util.Properties;
import javax.persistence.PersistenceException;

/**
 *
 * @author Manuel Felipe Sanchez R
 */
public abstract class DaoFactory {
   protected DaoFactory(){
       
   }
   //*
   private static volatile DaoFactory inst = null;
   public static DaoFactory getInstance(Properties appProperties){
        if (inst == null) {
            /*
            Syncronized permite una entrada de el hilo de ejecucion .
            */
            synchronized (DaoFactory.class) {
                if (inst == null) {
                    if (appProperties.get("dao").equals("mybatis")) {
                        //inst = new JDBCDaoFactory(appProperties);
                    } else {
                        throw new RuntimeException("Wrong configuration: Unsupported DAO:" + appProperties.get("dao"));
                    }
                }
            }
        }
        return inst;
   }
   public abstract void beginSession() throws PersistenceException;

    public abstract DaoEquipo getDaoEquipo();

    public abstract void commitTransaction() throws PersistenceException;

    public abstract void rollbackTransaction() throws PersistenceException;

    public abstract void endSession() throws PersistenceException;
    
}

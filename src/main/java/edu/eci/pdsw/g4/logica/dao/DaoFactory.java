/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.dao;

import edu.eci.pdsw.g4.persistencia.mybatis.factory.MyBatisDaoFactory;
import java.util.Properties;


/**
 *
 * @author Manuel Felipe Sanchez R
 */
public abstract class DaoFactory {
   protected DaoFactory(){
       
   }
   /*Construye una instancia de MyBatisDaoFactory apartir de un archivo
   de configuracion el marcador volatile se asigna para que haya una variable
   por cada objeto*/
   private static volatile DaoFactory inst = null;
   public static DaoFactory getInstance(Properties appProperties){
        if (inst == null) {
            /*
            Syncronized permite una sola entrada de el hilo de ejecucion .
            */
            synchronized (DaoFactory.class) {
                if (inst == null) {
                    if (appProperties.get("dao").equals("mybatis")) {
                        inst = new MyBatisDaoFactory(appProperties);
                    } else {
                        throw new RuntimeException("Wrong configuration: Unsupported DAO:" + appProperties.get("dao"));
                    }
                }
            }
        }
        return inst;
   }
   public abstract void beginSession()throws PersistenciaException;

    public abstract DaoEquipo getDaoEquipo();
    
    public abstract DaoEstadisticaEquipo getDaoEstadisticaEquipo();
   public abstract  DaoPrestamo getDaoPrestamo();
    public abstract void commitTransaction() throws PersistenciaException;

    public abstract void rollbackTransaction() throws PersistenciaException ;
    public abstract void endSession()  throws PersistenciaException;
    
}

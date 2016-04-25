/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.Prestamo;
import com.mycompany.persistencia.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author Manuel Felipe Sanchez R.
 */
public class ServicioPersisElectroECI {
    private static ServicioPersisElectroECI inst = null;
    private final Properties prop = new Properties();
    private final DaoFactory df = null;

    private List<Prestamo> prestamos;
    private ServicioPersisElectroECI(String properties) throws IOException{
        InputStream input = null;
        input = this.getClass().getClassLoader().getResourceAsStream(properties);
        prop.load(input);
    }
    public static ServicioPersisElectroECI getInstance(String propfile){
         if (inst==null){
            try {
                inst=new ServicioPersisElectroECI(propfile);
            } catch (IOException ex) {
                throw new RuntimeException("Error on application configuration:",ex);
            }
        }        
        return inst;
    }
    
    public List<Prestamo> getPrestamos(){
        return prestamos;
    }
    public void registrarPrestamo(){
        
    }
   public List<Equipo> selectAll(){
        try {
            DaoFactory df2 = DaoFactory.getInstance(prop);
            df2.beginSession();
            return df2.getDaoEquipo().SelectAll();
        } catch (PersistenceException ex) {
            Logger.getLogger(ServicioPersisElectroECI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
   public Equipo loadeqByid(int placa){
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           return df2.getDaoEquipo().loadeqByid(placa);
           
       }
       catch(PersistenceException pe){
        Logger.getLogger(ServicioPersisElectroECI.class.getName());}
      return null;
   }
   public void insertEquipo(Equipo eq ,int fk_tipomodel,int fk_pres_sol){
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           df2.getDaoEquipo().insertEquipo(eq);
           
           
       }
       catch(PersistenceException e){
           
       }
   }

}

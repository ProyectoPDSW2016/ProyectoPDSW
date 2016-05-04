/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.servicio;

import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.logica.dao.DaoFactory;
import edu.eci.pdsw.g4.logica.dao.PersistenciaException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
    public void registrarPrestamo(Equipo eq){
        
    }
    public void registarDevolucion(Equipo eq){
        
    }
   public List<Equipo> selectAll() throws PersistenciaException{
        try {
            DaoFactory df2 = DaoFactory.getInstance(prop);
            df2.beginSession();
            return df2.getDaoEquipo().SelectAll();
        } catch (PersistenciaException ex) {
            Logger.getLogger(ServicioPersisElectroECI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
   public Equipo loadeqByid(int placa) throws PersistenciaException{
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           return df2.getDaoEquipo().loadeqByid(placa);
           
       }
       catch(PersistenciaException pe){
        Logger.getLogger(ServicioPersisElectroECI.class.getName());}
      return null;
   }
   public void insertEquipo(Equipo eq ,int fk_tipomodel,int fk_pres_sol) throws PersistenciaException{
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           df2.getDaoEquipo().insertEquipo(eq);
           
           
       }
       catch(PersistenciaException e){
           
       }
   }
   public void insertTipoEquipo(TipoEquipo tp) throws PersistenciaException{
    DaoFactory df2 = DaoFactory.getInstance(prop);
    df2.beginSession();
    df2.getDaoEquipo().insertTipoEquipo(tp);
    
   }
   public List<TipoEquipo> selectAlltipoeq() throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
        List<TipoEquipo> selectAlltipoeq = df2.getDaoEquipo().selectAlltipoeq();
        return selectAlltipoeq;
   }
   
   public int tiempoDeVidaDeUnEquipo(int placa) throws PersistenciaException{
       
      return 0;
   }
   public List<Integer> tiempoDeVidaDeLosEquipo() throws PersistenciaException{
     return null;
   }

}

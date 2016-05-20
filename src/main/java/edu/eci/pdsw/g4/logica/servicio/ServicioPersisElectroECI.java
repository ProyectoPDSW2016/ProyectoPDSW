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
import edu.eci.pdsw.g4.logica.estructura.EstadisticasEquipo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Manuel Felipe Sanchez R.
 * Esta clase  usa un archivo de configuracion .properties para 
 * establecer el DAO que se usara , en este caso Mybatis
 * ademas de establecer el archivo de los parametros de la misma.
 */
public class ServicioPersisElectroECI {
    private static ServicioPersisElectroECI inst = null;
    private final Properties prop = new Properties();


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
    /*Consulta todos los equipos registrados en la base de datos
     *@return todos los equipos registrados en la base de datos
    
    */
    public List<TipoEquipo> selectAll() throws PersistenciaException{
        try {
            DaoFactory df2 = DaoFactory.getInstance(prop);
            df2.beginSession();
            List<TipoEquipo> equipos = df2.getDaoEquipo().SelectAll();
            df2.endSession();
            return equipos;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ServicioPersisElectroECI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /*Consulta un equipo en especifico
    *@param numero de placa del equipo
    *@return el equipo solicitidado
    
    */
    public Equipo loadeqByid(int placa) throws PersistenciaException{
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           Equipo equipo = df2.getDaoEquipo().loadeqByid(placa);
           df2.endSession();
           return equipo;
           
       }
       catch(PersistenciaException pe){
        Logger.getLogger(ServicioPersisElectroECI.class.getName());}
      return null;
   }
    /* Inserta un equipo en la base de datos
    *@param el equipo a registrar
    
    */
    public void insertEquipo(Equipo eq) throws PersistenciaException{
       try{
           DaoFactory df2 = DaoFactory.getInstance(prop);
           df2.beginSession();
           df2.getDaoEquipo().insertEquipo(eq);
           df2.commitTransaction();
           df2.endSession();
           
           
       }
       catch(PersistenciaException e){
           throw new PersistenciaException("Error de insertar equipo");           
       }
   }
    
    /* Inserta un tipo de equipo en la base de datos
    *@param el tipo de equipo a registrar
    
    */
    public void insertTipoEquipo(TipoEquipo tp) throws PersistenciaException{
        try {
            DaoFactory df2 = DaoFactory.getInstance(prop);
            df2.beginSession();
            df2.getDaoEquipo().insertTipoEquipo(tp);
            df2.commitTransaction();
            df2.endSession();
        } catch (PersistenciaException ex) {
            Logger.getLogger(ServicioPersisElectroECI.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   }
    
    /*Consulta todos los tipos de los equipos registrados en la base de datos
     *@return todos los tipos de los equipos registrados en la base de datos
    
    */
    public List<TipoEquipo> selectAlltipoeq() throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
        List<TipoEquipo> selectAlltipoeq = df2.getDaoEquipo().selectAlltipoeq();
        df2.endSession();
        return selectAlltipoeq;
   }
   /* Consulta el tiempo (horas) que ha sido usado un equipo
    *@param el numero de placa del equipo
    *@retorn el tiempo de uso de un equipo
    
    */
   public int tiempoDeVidaDeUnEquipo(int placa) throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
        int tiempo = df2.getDaoEquipo().tiempoDeVidaDeUnEquipo(placa);
        df2.endSession();
       
      return tiempo;
   }
   
    /* Consulta las estadisticas de un equipo para poder generar un reporte
   *@retorn una lista con las estadisticas de todos los equipos 
   
   */
    public List<EstadisticasEquipo> reporte() throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
        List<EstadisticasEquipo> reporte = df2.getDaoEstadisticaEquipo().reporte();
        df2.endSession();
       
      return reporte;
       
   }
    /*Inserta un prestamo en la base de datos
    *@param el prestamo  a registrar
    
    */
   public void insertPrestamo(Prestamo p) throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
       df2.getDaoPrestamo().insertPrestamo(p);
       df2.endSession();
   }
   /*Consulta todos prestamos realizados y existentes en la base de datos
   @Retorn una lista con todos los prestamos existentes
   
   */
   public List<Prestamo> selectPrestamos() throws PersistenciaException{
       DaoFactory df2 = DaoFactory.getInstance(prop);
       df2.beginSession();
        List<Prestamo> selectPrestamos = df2.getDaoPrestamo().selectPrestamos();
        df2.endSession();
        return selectPrestamos;
   }
   public Prestamo consultarPrestamo(int id) throws PersistenciaException{
       return null;
   }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.bean.control.web;


import edu.eci.pdsw.g4.bean.control.seguridad.ShiroLoginBean;
import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.Estudiante;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.logica.estructura.Usuario;
import edu.eci.pdsw.g4.logica.dao.PersistenciaException;
import edu.eci.pdsw.g4.logica.estructura.EstadisticasEquipo;
import edu.eci.pdsw.g4.logica.servicio.ExcepcionServiciosSistema;
import edu.eci.pdsw.g4.logica.servicio.ServicioPersisElectroECI;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import org.slf4j.LoggerFactory;
/**
 *
 * @author 2093130
 */


@ManagedBean (name="SystemManagedBeanEquipo")
@SessionScoped
public class SystemManageBean implements Serializable{
    ServicioPersisElectroECI  sec;
    
    private int placa;
    private int serial;
    private int tipomodel;
    private String observaciones;
    private char estado;
    private String modelo;
    private String nombre_equipo;
    private String url_img;
    private String marca;
    private int precio;
    private int vida_util;
    
    private static List<TipoEquipo> allsequipos=new ArrayList<TipoEquipo>();
private static final org.slf4j.Logger log = LoggerFactory.getLogger(SystemManageBean.class);
    public static List<TipoEquipo> getAllsequipos() {
        return allsequipos;
    }

    public static void setAllsequipos(List<TipoEquipo> allsequipos) {
        SystemManageBean.allsequipos = allsequipos;
    }
    
    
    
    public SystemManageBean() {
       sec = ServicioPersisElectroECI.getInstance("appConfreal.properties");
    }
  
   
    public ServicioPersisElectroECI getSec() {
        return sec;
    }

    public void setSec(ServicioPersisElectroECI sec) {
        this.sec = sec;
    }
    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getTipomodel() {
        return tipomodel;
    }

    public void setTipomodel(int tipomodel) {
        this.tipomodel = tipomodel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }
    public void insertarTipoequipo() throws PersistenciaException{
      TipoEquipo  tp = new TipoEquipo(modelo, nombre_equipo, url_img, marca, vida_util, precio);
      sec.insertTipoEquipo(tp);
        
        setModelo("");
        setNombre_equipo("");
        setUrl_img("");
        setMarca("");
        setVida_util(0);
        setPrecio(0);
        
        
    }
    
    public void insertarEquipo() throws PersistenciaException{
      Equipo  tp1 = new Equipo(placa, serial, tip1.getModelo(), observaciones, estado);
      sec.insertEquipo(tp1);
      setEstado(' ');
      setObservaciones("");
      setPlaca(0);
      setSerial(0);
      setTip1(null);
    }
    
    private TipoEquipo tip1;

    public TipoEquipo getTip1() {
        return tip1;
    }

    public void setTip1(TipoEquipo tip1) {
        this.tip1 = tip1;
    }
    public List<EstadisticasEquipo> getReporte(){
        try {
            
            return sec.reporte();
        } catch (PersistenciaException ex) {
            LoggerFactory.getLogger(SystemManageBean.class);
        }
        return null;
    }
    public List<TipoEquipo> getTipoEquipo(){
        try {
            return sec.selectAll();
        } catch (PersistenciaException ex) {
            Logger.getLogger(SystemManageBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
       
    public List<TipoEquipo> complete(String query) throws PersistenciaException{
       allsequipos=sec.selectAlltipoeq();
       List<TipoEquipo> filtradodetipo=new ArrayList<TipoEquipo>();
        
        for (int i = 0; i < allsequipos.size(); i++) {
            TipoEquipo eq=allsequipos.get(i);
            if(eq.getModelo().toLowerCase().startsWith(query)){
                filtradodetipo.add(eq);
            }  
        }
       return filtradodetipo;
    }
    
    



    

}

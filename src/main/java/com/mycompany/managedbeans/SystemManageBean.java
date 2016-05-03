/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managedbeans;


import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.Estudiante;
import com.mycompany.electroeci.TipoEquipo;
import com.mycompany.electroeci.Usuario;
import com.mycompany.persistencia.PersistenciaException;
import com.mycompany.services.ExcepcionServiciosSistema;
import com.mycompany.services.ServicioPersisElectroECI;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
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

    public static List<TipoEquipo> getAllsequipos() {
        return allsequipos;
    }

    public static void setAllsequipos(List<TipoEquipo> allsequipos) {
        SystemManageBean.allsequipos = allsequipos;
    }

    
    
    
    public SystemManageBean() {
       sec = ServicioPersisElectroECI.getInstance("appConfreal.properties");
       TipoEquipo alt=new TipoEquipo("12456", "lokos", "78945646", "lore", 3, 150000);       
        TipoEquipo alt1=new TipoEquipo("baboso", "lokos", "78945646", "lore", 3, 150000);       
        allsequipos.add(alt);
        allsequipos.add(alt1);
        System.out.println("Estoy pasando por aqui en constructor de managedbean");
       
    }
    private static final Logger LOG = Logger.getLogger(SystemManageBean.class.getName());
   
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
      TipoEquipo  tp = new TipoEquipo(tip1.getModelo(), nombre_equipo, url_img, marca, vida_util, precio);
      sec.insertTipoEquipo(tp);
      System.out.println("Insertado");
    }
    
    private TipoEquipo tip1;

    public TipoEquipo getTip1() {
        return tip1;
    }

    public void setTip1(TipoEquipo tip1) {
        this.tip1 = tip1;
    }
    
    
    
    public List<TipoEquipo> complete(String query) throws PersistenciaException{
       List<TipoEquipo> allsequipos=sec.selectAlltipoeq();
        System.out.println("bvnhsadsad"+allsequipos.toString());
       List<TipoEquipo> filtradodetipo=new ArrayList<TipoEquipo>();            
        
        for (int i = 0; i < allsequipos.size(); i++) {
            System.out.println(allsequipos.get(i)+"aquiii");
            TipoEquipo eq=allsequipos.get(i);
            if(eq.getModelo().toLowerCase().startsWith(query)){
                filtradodetipo.add(eq);
            }  
        }
       return filtradodetipo;
    }
    



    

}

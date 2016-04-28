/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.electroeci;

/**
 *
 * @author santiago-chisco
 */
public class Equipo {


    
    private int placa;
 
   // private String imagen;

   
    private int serial;
    private int tipo_model;
   // private int vidaUtil;
    private int precio;
    private String observaciones;
    private char estado;
  

    public Equipo(int placa, int serial,  int tipomodel,  int precio, String observaciones,char estado) {
        this.placa = placa;
     
     
        this.tipo_model = tipomodel;
     
        this.precio = precio;
        this.serial = serial;
        
        this.observaciones = observaciones;
        this.estado = estado;
   
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
    public int getPlaca(){
        return placa;
    }
    
    public void setPlaca(int placa){
        this.placa = placa;
    }

   

    
   
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public String getObservaciones(){
        return observaciones;
    }
        public int getTipo_model() {
        return tipo_model;
    }

    public void setTipo_model(int tipo_model) {
        this.tipo_model = tipo_model;
    }
    
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
}

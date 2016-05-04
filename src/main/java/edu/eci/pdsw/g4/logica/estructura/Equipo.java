/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.estructura;

/**
 *
 * @author santiago-chisco
 */
public class Equipo {

    private int placa;   
    private int serial;
    private String tipo_model;
    private String observaciones;
    private char estado;
  

    public Equipo(int placa, int serial,  String tipomodel, String observaciones,char estado) {
        
        this.placa = placa;
        this.tipo_model = tipomodel;
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

    
    public String getObservaciones(){
        return observaciones;
    }
        public String getTipo_model() {
        return tipo_model;
    }

    public void setTipo_model(String tipo_model) {
        this.tipo_model = tipo_model;
    }
    
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
}

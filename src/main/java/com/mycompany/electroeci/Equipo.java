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
    private String nombre;
    private String imagen;
    private String marca;
    private int vidaUtil;
    private int precio;
    private String observaciones;

    public Equipo(int placa, String nombre, String imagen, String marca, int vidaUtil, int precio, String observaciones) {
        this.placa = placa;
        this.nombre = nombre;
        this.imagen = imagen;
        this.marca = marca;
        this.vidaUtil = vidaUtil;
        this.precio = precio;
        this.observaciones = observaciones;
    }
    
    public int getPlaca(){
        return placa;
    }
    
    public void setPlaca(int placa){
        this.placa = placa;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getVidaUtil(){
        return vidaUtil;
    }
    public void setVidaUtil(int vidaUtil){
        this.vidaUtil = vidaUtil;
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
    
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
}

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
public abstract class Usuario {
    
    private int carnet;
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(int carnet, String nombre, String apellido, String email) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public int getCarnet(){
        return carnet;
    }
    
    public void setCarnet(int carnet){
        this.carnet = carnet;
    }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    
}

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
public class DetallePrestamo {
    private int cantidad;
    private Equipo equipo;

    public DetallePrestamo(int cantidad, Equipo equipo) {
        this.cantidad = cantidad;
        this.equipo = equipo;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Equipo getEquipo(){
        return equipo;
    }
    
    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
       
    }
    
}

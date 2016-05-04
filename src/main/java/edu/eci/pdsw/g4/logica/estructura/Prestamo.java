/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.estructura;

import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author santiago-chisco
 */
public class Prestamo {
    private int id;
    private Timestamp horaEntrega;
    private Timestamp horaDevolucion;
    private Set<DetallePrestamo> detallesPrestamos;

    public Prestamo(int id, Timestamp horaEntrega) {
        this.id = id;
        this.horaEntrega = horaEntrega;
        detallesPrestamos = new LinkedHashSet<>();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Timestamp getHoraEntrega(){
        return horaEntrega;
    }
    public void setHoraEntrega(Timestamp horaEntrega){
        this.horaEntrega = horaEntrega;
    }
    
    public Timestamp getHoraDevolucion(){
        return horaDevolucion;
    }
    
    public void setHoraDevolucion(Timestamp horaDevolucion){
        this.horaDevolucion = horaDevolucion;
    }
    
    public Set<DetallePrestamo> getDetallesPrestamo() {
        return detallesPrestamos;
    }

    public void setDetallesPrestamo(Set<DetallePrestamo> detallesPrestamos) {
        this.detallesPrestamos = detallesPrestamos;
    }
}

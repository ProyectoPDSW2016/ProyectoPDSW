/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.servicio;

/**
 *
 * @author oscar
 */
public class ExcepcionServiciosSistema extends Exception{
    
     public ExcepcionServiciosSistema() {
        
    }

    public ExcepcionServiciosSistema(String message) {
        super(message);
    }

    public ExcepcionServiciosSistema(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionServiciosSistema(Throwable cause) {
        super(cause);
    }
}

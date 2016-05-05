/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.estructura;

/**
 *
 * @author 2100609
 */
public class EstadisticasEquipo {
    private String imagen;
    private String nombreEquipo;
    private int serial;
    private char estado;
    private int vidaUtil;
    private float horasUso;

    public EstadisticasEquipo(String imagen, String nombreEquipo, int serial, char estado, int vidaUtil, float horasUso) {
        this.imagen = imagen;
        this.nombreEquipo = nombreEquipo;
        this.serial = serial;
        this.estado = estado;
        this.vidaUtil = vidaUtil;
        this.horasUso = horasUso;
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
    public float getHorasUso(){
        return horasUso;
    }
    public void setHorasUso(float horasUso){
        this.horasUso = horasUso;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombre_equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    
}

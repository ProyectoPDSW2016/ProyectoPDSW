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
public class Estudiante extends Usuario{
    
    private String carrera;
    private int semestre;

    public Estudiante(int carnet, String nombre, String apellido, String email, String carrera, int semestre) {
        super(carnet, nombre, apellido, email);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
}

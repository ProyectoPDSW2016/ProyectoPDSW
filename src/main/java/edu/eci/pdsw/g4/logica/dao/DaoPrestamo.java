/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.dao;

import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import java.util.List;

/**
 *
 * @author Manuel Felipe Sanchez R.
 */
public interface  DaoPrestamo {
    public void insertPrestamo(Prestamo p);
    public List<Prestamo> selectPrestamos();
    public Prestamo consultarPrestamo(int id);
}

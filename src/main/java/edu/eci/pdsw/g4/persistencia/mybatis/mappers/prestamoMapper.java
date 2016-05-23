/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.mappers;

import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author santiago-chisco
 */
public interface prestamoMapper {
    public void insertarPrestamo(@Param("prestamo")Prestamo pres);
    public List<Prestamo> Selectprestamo();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.mappers;

import edu.eci.pdsw.g4.logica.estructura.DetallePrestamo;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author Manuel Felipe Sanchez R.
 */
public interface RegPresMapper {

    /**
     *
     * @param pres : Objeto para la insercion en la tabla prestamo_solicitud.
     */
    public void insertPrestamo(@Param("prestamo")Prestamo pres);
    public int cantidad();
    public List<Prestamo> Selectprestamo();
    public Prestamo consultarPrestamo(@Param("prestamo")int id);
    public void insertarDetalle(@Param("prestamo")int id,@Param("equipo")int placa,@Param("detalle") DetallePrestamo d);
}

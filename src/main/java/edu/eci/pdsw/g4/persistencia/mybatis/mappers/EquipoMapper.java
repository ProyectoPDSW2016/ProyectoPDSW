/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.mappers;

import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import java.util.List;
import java.util.Set;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author Manuel Felipe Sanchez R.
 */
public interface EquipoMapper {
    /**
     * Cargar equipo existente por ID
     * @param placa  : Placa del equipo a consulta 
     * @return : objeto Equipo
     */
   public Equipo loadeqByid(@Param("plac") int placa);
  /**
     * Cargar todos los equipos existentes
     * @return : Lista de equipos
     */
   public List<Equipo> selectAll();
   /**
     * Insertar un nuevo Equipo
     *
     * @param eq
     * @param model
     * @param pres_slctud
     */
   public void insertEquipo(@Param("equipo") Equipo eq);
  
    /** Insersion de un Tipo de Equipo a la BD
     *
     * @param equipo

     */
    public void insertTipo_equipo(@Param("tipo_eq") TipoEquipo equipo);
     public List<TipoEquipo> selectAlltipoeq();
    
     public int tiempoDeVidaDeUnEquipo(@Param("plac")int placa);
     
     public List<TipoEquipo> reporte();
}

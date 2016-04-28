/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mappers;

import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.TipoEquipo;
import java.util.List;
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
   public void insertEquipo(@Param("equipo") Equipo eq,@Param("fk_tipo_modelo")int model,@Param("fk_pres_sctud")int pres_slctud);
  
    /** Insersion de un Tipo de Equipo a la BD
     *
     * @param equipo

     */
    public void insertTipo_equipo(@Param("tipo_eq") TipoEquipo equipo);
     public List<TipoEquipo> selectAlltipoeq();
}

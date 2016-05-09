/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.mappers;

import edu.eci.pdsw.g4.logica.estructura.EstadisticasEquipo;
import java.util.List;

/**
 *
 * @author 2100609
 */
public interface EstadisticasEquipoMapper {
    
    
    /**
     * Consulta un reporte sobre la informacion y el uso de los equipos
     * @return  una lista con la informacion y el uso de los equipos
     */
    public List<EstadisticasEquipo> reporte();
}

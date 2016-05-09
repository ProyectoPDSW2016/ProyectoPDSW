/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.factory;

import edu.eci.pdsw.g4.logica.dao.DaoEstadisticaEquipo;
import edu.eci.pdsw.g4.logica.estructura.EstadisticasEquipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.EstadisticasEquipoMapper;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author 2100609
 */
public class MyBatisDaoEstadisticasEquipo implements DaoEstadisticaEquipo {
    private SqlSession sqlss;
    private EstadisticasEquipoMapper estadisticas = null;

    public MyBatisDaoEstadisticasEquipo(SqlSession sqlss) {
        this.sqlss = sqlss;
        estadisticas = sqlss.getMapper(EstadisticasEquipoMapper.class);
    }

    @Override
    public List<EstadisticasEquipo> reporte() {
        List<EstadisticasEquipo> reporte = estadisticas.reporte();
        sqlss.commit();
        return reporte;
    }
    
    
    
}

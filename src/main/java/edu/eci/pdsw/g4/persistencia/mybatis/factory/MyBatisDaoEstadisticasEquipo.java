/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.factory;

import edu.eci.pdsw.g4.logica.dao.DaoEstadisticaEquipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author 2100609
 */
public class MyBatisDaoEstadisticasEquipo implements DaoEstadisticaEquipo {
    private SqlSession sqlss;

    public MyBatisDaoEstadisticasEquipo(SqlSession sqlss) {
        this.sqlss = sqlss;
    }

    @Override
    public List<TipoEquipo> reporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

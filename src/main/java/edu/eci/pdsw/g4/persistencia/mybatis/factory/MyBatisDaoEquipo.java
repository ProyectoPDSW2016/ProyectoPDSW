/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.factory;

import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.EquipoMapper;
import edu.eci.pdsw.g4.logica.dao.DaoEquipo;
import edu.eci.pdsw.g4.logica.dao.PersistenciaException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Manuel Felipe Sanchez R.
 * La clase MyBatisDaoEquipo contiene la implementacion
 * de los metodos pertinentes a la interfaz DaoEquipo, 
 * el constructor recibe una session para poder asignarla al
 * EquipoMapper que contiene la implementacion de los metodos de persistencia.
 */
public class MyBatisDaoEquipo implements DaoEquipo{
    private SqlSession sqlss;
    private EquipoMapper equmapper = null;
    public MyBatisDaoEquipo(SqlSession session) {
        this.sqlss = session;
        equmapper = session.getMapper(EquipoMapper.class);
    }

    
    @Override
    public Equipo loadeqByid(int equipo_id) throws PersistenciaException {
       Equipo resp = equmapper.loadeqByid(equipo_id);
       sqlss.commit();
       return resp;
    }

    @Override
    public void insertEquipo(Equipo eq) throws PersistenciaException {
        
        equmapper.insertEquipo(eq);
        sqlss.commit();
    }

    @Override
    public List<TipoEquipo> SelectAll() throws PersistenciaException {
        List<TipoEquipo> aux = equmapper.selectAlltipoeq();
        sqlss.commit();
        return aux;
    }

    

    @Override
    public void insertTipoEquipo(TipoEquipo tp){
        equmapper.insertTipo_equipo(tp);
        sqlss.commit();
        System.out.println("---------------------------------->Tipo insertado con exito!");
    }

    @Override
    public List<TipoEquipo> selectAlltipoeq() {
        List<TipoEquipo> selectAlltipoeq = equmapper.selectAlltipoeq();
       sqlss.commit();
        System.out.println("----------------------------------->Tipo Equipo cargado ok");
     return selectAlltipoeq;
    }

    @Override
    public int tiempoDeVidaDeUnEquipo(int placa) {
       int tiempo = equmapper.tiempoDeVidaDeUnEquipo(placa);
       sqlss.commit();
       return tiempo;
    }

    @Override
    public List<TipoEquipo> reporte() {
        List<TipoEquipo> reporte = equmapper.reporte();
        sqlss.commit();
        return reporte;
    }
    
    
}

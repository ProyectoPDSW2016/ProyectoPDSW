/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoimpl;

import com.mycompany.electroeci.Equipo;
import com.mycompany.mappers.EquipoMapper;
import com.mycompany.persistencia.DaoEquipo;
import java.util.List;
import javax.persistence.PersistenceException;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Manuel Felipe Sanchez R.
 * La clase MyBatisDaoEquipo contiene la implementacion
 * de los metodos pertinentes a la interfaz DaoEquipo, 
 * el contructor recibe una session para poder asignarla al
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
    public Equipo loadeqByid(int equipo_id) throws PersistenceException {
       Equipo resp = equmapper.loadeqByid(equipo_id);
       sqlss.commit();
       return resp;
    }

    @Override
    public void insertEquipo(Equipo eq) throws PersistenceException {
        
        equmapper.insertEquipo(eq, 0, 0);
        sqlss.commit();
    }

    @Override
    public List<Equipo> SelectAll() throws PersistenceException {
        List<Equipo> resp = equmapper.selectAll();
        sqlss.commit();
        return resp;
    }
    
}

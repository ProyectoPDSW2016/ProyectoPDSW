/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoimpl;

import com.mycompany.electroeci.Equipo;
import com.mycompany.mappers.EquipoMapper;
import com.mycompany.persistencia.DaoEquipo;
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

    private EquipoMapper eq = null;
    public MyBatisDaoEquipo(SqlSession session) {
        eq = session.getMapper(EquipoMapper.class);
    }

    @Override
    public Equipo load(int equipo_id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Equipo eq) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Equipo eq) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

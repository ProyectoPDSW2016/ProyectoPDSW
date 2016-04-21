/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import com.mycompany.electroeci.Equipo;
import javax.persistence.PersistenceException;

/**
 *
 * @author Manuel Felipe Sanchez R
 * 
 */
public interface DaoEquipo {
    public Equipo load(int equipo_id)throws PersistenceException;
    public void save(Equipo eq)throws PersistenceException;
    public void update(Equipo eq)throws PersistenceException;
    
    
}

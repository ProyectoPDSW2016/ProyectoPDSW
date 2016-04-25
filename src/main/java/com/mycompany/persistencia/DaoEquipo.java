/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import com.mycompany.electroeci.Equipo;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author Manuel Felipe Sanchez R
 *
 */
public interface DaoEquipo {
    
    public Equipo loadeqByid(int equipo_id)throws PersistenceException;
    public void insertEquipo(Equipo eq)throws PersistenceException;
    public List<Equipo> SelectAll()throws PersistenceException;
    
    
}

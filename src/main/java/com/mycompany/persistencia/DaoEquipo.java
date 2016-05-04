/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.TipoEquipo;
import java.util.List;


/**
 *
 * @author Manuel Felipe Sanchez R
 *
 */
public interface DaoEquipo {
    
    public Equipo loadeqByid(int equipo_id)throws PersistenciaException;
    public void insertEquipo(Equipo eq)throws PersistenciaException;
    public List<Equipo> SelectAll()throws PersistenciaException;
    public void insertTipoEquipo( TipoEquipo tp );
    public List<TipoEquipo> selectAlltipoeq();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.logica.dao;

import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import java.util.List;


/**
 *
 * @author Manuel Felipe Sanchez R
 *   
 */
public interface DaoEquipo {
    
    public Equipo loadeqByid(int equipo_id)throws PersistenciaException;
    public void insertEquipo(Equipo eq)throws PersistenciaException;
    public List<TipoEquipo> SelectAll()throws PersistenciaException;
    public void insertTipoEquipo( TipoEquipo tp );
    public List<TipoEquipo> selectAlltipoeq();
    public int tiempoDeVidaDeUnEquipo(int placa);
    public List<TipoEquipo> reporte();
}

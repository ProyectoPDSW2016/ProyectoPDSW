/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.factory;

import edu.eci.pdsw.g4.logica.dao.DaoPrestamo;
import edu.eci.pdsw.g4.logica.estructura.DetallePrestamo;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.EquipoMapper;
import org.apache.ibatis.session.SqlSession;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.RegPresMapper;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Felipe
 *  * La clase MyBatisDaoPrestamo contiene la implementacion
 * de los metodos pertinentes a la interfaz DaoPrestamo, 
 * el constructor recibe una session para poder asignarla al
 * RegPresMapper que contiene la implementacion de los metodos de persistencia.
 */
public class MyBatisDaoPrestamo  implements DaoPrestamo{
  private SqlSession session ;
  private RegPresMapper regPres = null;

    public MyBatisDaoPrestamo(SqlSession session) {
        this.session = session;
        regPres = session.getMapper(RegPresMapper.class);
    }

    public void insertPrestamo(Prestamo p) {
         //
        regPres.insertPrestamo(p);
        
    }


    public List<Prestamo> selectPrestamos() {
      List<Prestamo> Selectprestamo = regPres.Selectprestamo();
    
       return Selectprestamo;
    }

    public Prestamo consultarPrestamo(int id) {
        return regPres.consultarPrestamo(id);
    }

    public void insertarDetalle(int prestamo_Id, int placa, DetallePrestamo dp) {
        regPres.insertarDetalle(placa, placa, dp);
       
    }
    

}

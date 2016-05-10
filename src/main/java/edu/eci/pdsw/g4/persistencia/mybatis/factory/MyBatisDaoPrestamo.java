/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.persistencia.mybatis.factory;

import edu.eci.pdsw.g4.logica.dao.DaoPrestamo;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.EquipoMapper;
import org.apache.ibatis.session.SqlSession;
import edu.eci.pdsw.g4.persistencia.mybatis.mappers.RegPresMapper;
import java.util.List;

/**
 *
 * @author Felipe
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
        session.commit();
    }

    public List<Prestamo> selectPrestamos() {
      List<Prestamo> Selectprestamo = regPres.Selectprestamo();
       session.commit();
       return Selectprestamo;
    }


}

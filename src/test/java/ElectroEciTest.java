/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.electroeci.Equipo;
import com.mycompany.services.ServicioPersisElectroECI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2100609
 */
public class ElectroEciTest {
    
    public ElectroEciTest() {
    }
    @Before
    public void setUp() {
    }

    @After
    public void clearDB() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "anonymous", "");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from Equipo");
        stmt.execute("delete from Tipo_Equipo");
        conn.commit();
        conn.close();
    }

    /**
     * Obtiene una conexion a la base de datos de prueba
     * @return
     * @throws SQLException 
     */
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "anonymous", "");        
    }
    
    @Test
    public void pruebaCeroTest() throws SQLException {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
      ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
      Equipo eq = new Equipo(001, "Prueba1", 002, "algo.jpg", "Texas", 5, 120000, "Esta es una prueba");
      spECI.insertEquipo(eq, 0, 0);
        Equipo loadeqByid = spECI.loadeqByid(001);
        System.out.println("Equipo cargado:" + loadeqByid.getNombre());
        //Realizar la operacion de la logica y la prueba
        

    }  
        
    /*
     @Test
     public void consultarTiempoEquipoRecienRegistrado() {
         /*
         clase de equivalencia equipo recien registrado sin haber sido prestado 
         
         assertTrue(true);
         
         
     }
     @Test
     public void consultarTiempoEquipoConUnPrestamo() {
         
         clase de equivalencia equipo con un solo prestamo 
         
         assertTrue(true);
         
     }
     @Test
     public void consultarTiempoEquipoConMasDeUnPrestamo() {
         /*
         clase de equivalencia de un equipo con mas de un prestamo sin que la vida de uso 
         sea mayor que la vida util
         
         assertTrue(true);
         
     }
     
     @Test
     public void consultarTiempoEquipoSinVidaUtil() {
         /*
         clase de equivalencia equipo con cuya vida de uso es mayor que 
         la vida util
         
         assertTrue(true);
         
     }
    */
}

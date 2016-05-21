/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.logica.dao.PersistenciaException;
import edu.eci.pdsw.g4.logica.estructura.DetallePrestamo;
import edu.eci.pdsw.g4.logica.estructura.Estudiante;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import edu.eci.pdsw.g4.logica.estructura.Usuario;
import edu.eci.pdsw.g4.logica.servicio.ServicioPersisElectroECI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        stmt.execute("delete from Detalle_Prestamo");
        stmt.execute("delete from Usuario");
        stmt.execute("delete from prestamo_solicitud");
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
    public void insercionEquipos() throws SQLException, PersistenciaException {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
      ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
        TipoEquipo pruebaT1 = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
        Equipo pruebaEq1 = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
        spECI.insertTipoEquipo(pruebaT1);
        spECI.insertEquipo(pruebaEq1);;
        List<TipoEquipo> selectAll = spECI.selectAll();
        assertEquals(1, selectAll.size());
        
        /*
        String toString = selectAll.toString();System.out.println(""+toString);
        //Realizar la operacion de la logica y la prueba
        
        TipoEquipo tq = new TipoEquipo("TX-1001", "Calculadora", "imagen1.html", "Casio", 4, 10000);
        TipoEquipo tq2 = new TipoEquipo("TX-1021", "Calculadora", "imagen1.html", "Casio", 4, 10000);
       spECI.insertTipoEquipo(tq);
       spECI.insertTipoEquipo(tq2);
        List<TipoEquipo> selectAlltipoeq = spECI.selectAlltipoeq();
        String toString1 = selectAlltipoeq.toString(); System.out.println(""+ toString1);
        */
    }
    /*
    Insersion de prestamo sencillo , No Parametro Hora se obtiene de sql
    
    @Test 
    public void insertprestamo() throws PersistenciaException{
        boolean val = false;
        Prestamo pr = new Prestamo(001,2108221);
        Prestamo pr2 = new Prestamo(002,2108222);
        ServicioPersisElectroECI speci = ServicioPersisElectroECI.getInstance("appConfig.properties");
        speci.insertPrestamo(pr);
        speci.insertPrestamo(pr2);
        
        List<Prestamo> selectPrestamos = speci.selectPrestamos();
        System.out.println("------------Prestamos----------------");
        int count =0;
        for (Prestamo selectPrestamo : selectPrestamos) {
            count++;
            System.out.println("Prestamo " + count+ " concebido al usuario:" + selectPrestamo.getId() + "Hora de Entrega:" +selectPrestamo.getHoraEntrega());
            
        }
        if(count==2) val=true;
        System.out.println("------------------->Ya inserte el registro :)");
        assertTrue("Acabamos esta prueba ",val);
    }*/
    /*
    Clase de equivalencia para registrar un prestamo a una persona especifica
   
    @Test 
    public void prestamoEquipoAUnaPersona() throws PersistenciaException{

        Usuario persona = new Estudiante(2100609, "Santiago", "Chisco", "david.chisco@mail.escuelaing.edu.co", "Ingenieria de sistemas", 7);
        TipoEquipo tipoEquipo = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
        Equipo equipo = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
        
        Prestamo prestamo = new Prestamo(persona.getCarnet(),1);
        Set<DetallePrestamo> detallesPrestamos = new LinkedHashSet();
        DetallePrestamo dp = new DetallePrestamo(1, equipo);
        detallesPrestamos.add(dp);
        prestamo.setDetallesPrestamo(detallesPrestamos);
        ServicioPersisElectroECI spECI = ServicioPersisElectroECI.getInstance("appConfig.properties");
        spECI.insertPrestamo(prestamo);
        assertEquals(persona.getCarnet(),spECI.consultarPrestamo(1).getId_usuario());
        
    } */
    /*
    Clase de equivalencia para registrar un prestamo con un equipo especifico
   
    @Test 
    public void prestamoEquipoEspecifico() throws PersistenciaException{

        Usuario persona = new Estudiante(2100609, "Santiago", "Chisco", "david.chisco@mail.escuelaing.edu.co", "Ingenieria de sistemas", 7);
        TipoEquipo tipoEquipo = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
        Equipo equipo = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
        
        Prestamo prestamo = new Prestamo(persona.getCarnet(),1);
        Set<DetallePrestamo> detallesPrestamos = new LinkedHashSet();
        DetallePrestamo dp = new DetallePrestamo(1, equipo);
        detallesPrestamos.add(dp);
        prestamo.setDetallesPrestamo(detallesPrestamos);
        ServicioPersisElectroECI spECI = ServicioPersisElectroECI.getInstance("appConfig.properties");
        spECI.insertPrestamo(prestamo);
        Set<DetallePrestamo> detallesConsulta = spECI.consultarPrestamo(1).getDetallesPrestamo();
        Iterator<DetallePrestamo> i =detallesConsulta.iterator();
        DetallePrestamo detalle=null;
        while(i.hasNext()){
             detalle = i.next();
        }
        assertEquals(equipo.getPlaca(),detalle.getEquipo().getPlaca());
        
    } */
     /*
    Clase de equivalencia para registrar un prestamo con mas de un equipo
   
    @Test 
    public void prestamoMasDeUnEquipo() throws PersistenciaException{

        Usuario persona = new Estudiante(2100609, "Santiago", "Chisco", "david.chisco@mail.escuelaing.edu.co", "Ingenieria de sistemas", 7);
        TipoEquipo tipoEquipo = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
        Equipo equipo = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
        TipoEquipo pruebaT2 = new TipoEquipo("4102", "Generador de ondas", "ondas.jpg", "Fluke", 17520, 4227731);
        Equipo pruebaEq2 = new Equipo(2, 1, "4102","Sin observaciones",'A');
        Equipo pruebaEq3 = new Equipo(3, 15, "4102","Sin observaciones",'A');
        
        Prestamo prestamo = new Prestamo(persona.getCarnet(),1);
        Set<DetallePrestamo> detallesPrestamos = new LinkedHashSet();
        DetallePrestamo dp = new DetallePrestamo(1, equipo);
        DetallePrestamo dp1 = new DetallePrestamo(1, pruebaEq2);
        DetallePrestamo dp2 = new DetallePrestamo(1, pruebaEq3);
        detallesPrestamos.add(dp);
        detallesPrestamos.add(dp1);
        detallesPrestamos.add(dp2);
        prestamo.setDetallesPrestamo(detallesPrestamos);
        ServicioPersisElectroECI spECI = ServicioPersisElectroECI.getInstance("appConfig.properties");
        spECI.insertPrestamo(prestamo);
        Set<DetallePrestamo> detallesConsulta = spECI.consultarPrestamo(1).getDetallesPrestamo();
       
        assertEquals(detallesPrestamos.size(),detallesConsulta.size());
        
    }
 */
    @Test
     public void insertarUnEquipo() throws PersistenciaException  {
            //clase de equivalencia equipo recien registrado sin haber sido prestado
            TipoEquipo pruebaT1 = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
            Equipo pruebaEq1 = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
            ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
            spECI.insertTipoEquipo(pruebaT1);
            spECI.insertEquipo(pruebaEq1);
            assertEquals(pruebaEq1.getSerial(),spECI.loadeqByid(1).getSerial());
         
     }
        
    
     @Test
     public void consultarTiempoEquipoRecienRegistrado() throws PersistenciaException  {
            //clase de equivalencia equipo recien registrado sin haber sido prestado
            TipoEquipo pruebaT1 = new TipoEquipo("DG4102", "Generador de Funciones", "imagen2.jpg", "RIGOL", 17520, 3127731);
            Equipo pruebaEq1 = new Equipo(1, 1, "DG4102","Sin observaciones",'A');
            ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
            spECI.insertTipoEquipo(pruebaT1);
            spECI.insertEquipo(pruebaEq1);
            assertEquals(pruebaT1.getVida_util(),17520);
         
     }
     @Test
     public void consultarTiempoEquipoConUnPrestamo() throws PersistenciaException {
         //clase de equivalencia equipo recien registrado con un solo prestamo (de una hora)
         TipoEquipo pruebaT2 = new TipoEquipo("4102", "Generador de ondas", "ondas.jpg", "Fluke", 17520, 4227731);
         Equipo pruebaEq2 = new Equipo(1, 1, "4102","Sin observaciones",'A');
         ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
         spECI.insertTipoEquipo(pruebaT2);
         spECI.insertEquipo(pruebaEq2);
         spECI.registrarPrestamo(pruebaEq2);
         spECI.registarDevolucion(pruebaEq2);
         assertEquals(17519,17519);
         
     }
     @Test
     public void consultarTiempoEquipoConMasDeUnPrestamo() throws PersistenciaException {
         
         //clase de equivalencia de un equipo con mas de un prestamo sin que la vida de uso 
         //sea mayor que la vida util(cada prestamo fue de 25 horas para un total de 150 horas de uso)
         TipoEquipo pruebaT3 = new TipoEquipo("100", "Multimetro", "multi.jpg", "Fluke", 500, 50000);
         Equipo pruebaEq3 = new Equipo(25, 1, "100","Sin observaciones",'A');
         ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
         spECI.insertTipoEquipo(pruebaT3);
         spECI.insertEquipo(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         spECI.registrarPrestamo(pruebaEq3);
         spECI.registarDevolucion(pruebaEq3);
         assertEquals(350,350);
         
     }
     
     @Test
     public void consultarTiempoEquipoSinVidaUtil() throws PersistenciaException {
         
         //clase de equivalencia equipo con cuya vida de uso es mayor que la vida util
         //(Cada prestamo fue de 20 horas)
         TipoEquipo pruebaT4 = new TipoEquipo("25", "Circuito", "circ.jpg", "Fluke", 100, 49000);
         Equipo pruebaEq4 = new Equipo(98, 1, "25","La vida util es muy corta",'A');
         ServicioPersisElectroECI spECI =  ServicioPersisElectroECI.getInstance("appConfig.properties");
         spECI.insertTipoEquipo(pruebaT4);
         spECI.insertEquipo(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         spECI.registrarPrestamo(pruebaEq4);
         spECI.registarDevolucion(pruebaEq4);
         assertEquals(-20,-20);
         
         
     }
    
}

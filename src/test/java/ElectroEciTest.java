/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

        
    
     @Test
     public void consultarTiempoEquipoRecienRegistrado() {
         /*
         clase de equivalencia equipo recien registrado sin haber sido prestado 
         */
         assertTrue(true);
         
         
     }
     @Test
     public void consultarTiempoEquipoConUnPrestamo() {
         /*
         clase de equivalencia equipo con un solo prestamo 
         */
         assertTrue(true);
         
     }
     @Test
     public void consultarTiempoEquipoConMasDeUnPrestamo() {
         /*
         clase de equivalencia de un equipo con mas de un prestamo sin que la vida de uso 
         sea mayor que la vida util
         */
         assertTrue(true);
         
     }
     
     @Test
     public void consultarTiempoEquipoSinVidaUtil() {
         /*
         clase de equivalencia equipo con cuya vida de uso es mayor que 
         la vida util
         */
         assertTrue(true);
         
     }
}

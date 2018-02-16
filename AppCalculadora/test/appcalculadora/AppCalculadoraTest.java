/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diurno
 */
public class AppCalculadoraTest {
   private AppCalculadora calcu;
    
    
    public AppCalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void creaCalculadora() {
        calcu = new AppCalculadora(20,10);
    }

    @After
   public void borraCalculadora() {
        calcu = null;
   }

    /**
     * Test of suma method, of class AppCalculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int result = calcu.suma();
        assertEquals(30, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of resta method, of class AppCalculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int resultado = calcu.resta();
        assertEquals(10, resultado);
    }

    /**
     * test del metodo multiplicar
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }

    /**
     * test del metodo divide
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
      
        int resultado = calcu.divide();
        assertEquals(2, resultado);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaenteros;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diurno
 */
public class TablaEnterosTest {
     static TablaEnteros lista;
     static TablaEnteros lista2;
    
    public TablaEnterosTest() {
    }
    
     
    @BeforeClass
    public static void crea(){
   lista=new TablaEnteros(new Integer[]{9,2,0,-2,3});
   lista2=new TablaEnteros(new Integer[2]);
    
    }
    
    @AfterClass
    public static void cierra(){
        lista=null;
        lista2=null;
    }

    /**
     * Test of Null pointer exception
     */
    @Test(expected =  java.lang.NullPointerException.class)
    public void testSumaTabla() {
        System.out.println("NullPointerException");
        int result=lista2.sumaTabla();
        
    }
    /**
     * Test of sumaTabla
     */
      @Test
    public void testSumaTabla2() {
        System.out.println("sumaTabla");
        int result=lista.sumaTabla();
         assertEquals(12, result);
    }

    /**
     * Test of mayorTabla method, of class TablaEnteros.
     */
    @Test
    public void testMayorTabla() {
        System.out.println("mayorTabla");
     
        int result;
        result = lista.mayorTabla();
        assertEquals(9, result);

    }

    /**
     * Test of posicionTabla method, of class TablaEnteros.
     */
    @Test (expected =  java.util.NoSuchElementException.class)
    public void testPosicionTabla() {
        System.out.println("NoSuchElementException");
        int result = lista.posicionTabla(96);
       

    }
    
        @Test
    public void testPosicionTabla2() {
        System.out.println("posicionTabla");
        int result = lista.posicionTabla(3);
         assertEquals(4, result);
    }
    
}

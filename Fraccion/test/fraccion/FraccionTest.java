/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diurno
 */
public class FraccionTest {
    static Fraccion a;
    static Fraccion b;
    static Fraccion c;
    static Fraccion d;
    
    @BeforeClass
    public static void creaFraccion(){
       a=new Fraccion (2,5);
         b=new Fraccion (-5,-2);
         c=new Fraccion (10,9);
         d=new Fraccion (8,1);
    }
    
    
    @AfterClass
    public static void cierraFraccion(){
        a=null;
        b=null;
        c=null;
        d=null;
    }

    /**
     * Test of sumar method, of class Fraccion.
     * 
     */
    @Test
    public void testSumar(){
        System.out.println("sumar");
        Fraccion expResult = new Fraccion (-29,-10);
        Fraccion result = Fraccion.sumar(a, b);
        assertEquals(expResult.aString(), result.aString());
       
    }

    /**
     * Test of restar method, of class Fraccion.
     * 
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Fraccion expResult = new Fraccion (21,-10);
        Fraccion result = Fraccion.restar(a, b);
        assertEquals(expResult.aString(), result.aString());
       
    }

    /**
     * Test of multiplicar method, of class Fraccion.
     * 
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Fraccion expResult=new Fraccion (20,45);
        Fraccion result = Fraccion.multiplicar(a, c);
        assertEquals(expResult.aString(), result.aString());
     
    }

    /**
     * Test of inversa method, of class Fraccion.
     *
     */
    @Test
    public void testInversa() {
        System.out.println("inversa");
        Fraccion result = Fraccion.inversa(b);
         Fraccion expResult=new Fraccion (-2,-5);
         assertEquals(expResult.aString(), result.aString());

    }

    /**
     * Test of dividir method, of class Fraccion.
     *
     */
    
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion expResult = new Fraccion (2,40);
        Fraccion result = Fraccion.dividir(a, d);
        assertEquals(expResult.aString(), result.aString());
      
    }


    /**
     * Test of aString method, of class Fraccion.
     */
    @Test
    public void testAString() {
        System.out.println("aString");
        
        String expResult = "2/5";
        String result =a.aString();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of simplificar method, of class Fraccion.
     */
    @Test
    public void testSimplificar() {
        System.out.println("simplificar");
       
        Fraccion expResult = new Fraccion (8,1);
       String result = d.simplificar().aString();
        assertEquals(expResult.aString(), result);
      
    }
    
    
       @Test (expected = java.lang.ArithmeticException.class)
    public void crearDenCero() throws ArithmeticException {
    Fraccion cero=new Fraccion(5,0);
    }
       
    
}

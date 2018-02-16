/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author diurno
 * 
 * */


@RunWith(Parameterized.class)

public class AppDivideTest {
    private int num1;
    private int num2;
    private int resul;
    
    public AppDivideTest( int num1, int num2, int resul) {
        this.num1=num1;
        this.num2=num2;
        this.resul=resul;
    }
    
   @Parameters
   public static Collection<Object[]> byneris(){
       return Arrays.asList (new Object[][] {{20,10,2},{30,-2,-15},{5,2,2}}); 
   }
    
    
    
    @Before
    public void setUp() {
    
    }
    
    @After
    public void tearDown() {
    }

  

   
    /**
     * Test of divide method, of class AppCalculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        AppCalculadora calcu=new AppCalculadora(num1, num2);
        int result = calcu.divide();
        assertEquals(resul, result);
        
    }
    
}

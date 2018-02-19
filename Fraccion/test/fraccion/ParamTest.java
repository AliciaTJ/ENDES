/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ALicia
 */

@RunWith(Parameterized.class)
public class ParamTest {
    Fraccion fraccion1;
    Fraccion fraccion2;
    Fraccion resul;
    
/**
 * 
 * @param fraccion1 clase Fraccion
 * @param fraccion2 clase Fraccion 
 * @param resul clase Fraccion
 */
    public ParamTest(Fraccion fraccion1, Fraccion fraccion2, Fraccion resul) {
        this.fraccion1=fraccion1;
        this.fraccion2=fraccion2;
        this.resul=resul;
    }
  
/**
 * 
 * @return Array de la clase Fraccion para TEST
     * @throws java.lang.Exception
 */

  @Parameterized.Parameters
   public static Collection<Fraccion[]> suma() throws Exception{
       return Arrays.asList (new Fraccion[][] {{new Fraccion(8,9),new Fraccion (3,8), new Fraccion (91,72)}
      , {new Fraccion(8,3),new Fraccion (-2,-3), new Fraccion (-30,-9)}}); 
   }
    
    
    
    /**
     * Test of sumar method, of class Fraccion.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Fraccion result = Fraccion.sumar(fraccion1, fraccion2);
        assertEquals(resul.aString(), result.aString());
    }

    
}

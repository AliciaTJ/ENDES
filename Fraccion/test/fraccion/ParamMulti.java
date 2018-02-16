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
public class ParamMulti {
    Fraccion fraccion1;
    Fraccion fraccion2;
    Fraccion resul;
    
/**
 * 
 * @param fraccion1 clase Fraccion
 * @param fraccion2 clase Fraccion 
 * @param resul clase Fraccion
 */
    public ParamMulti(Fraccion fraccion1, Fraccion fraccion2, Fraccion resul) {
        this.fraccion1=fraccion1;
        this.fraccion2=fraccion2;
        this.resul=resul;
    }
  
/**
 * 
 * @return Array de la clase Fraccion para TEST
     * 
 */

  @Parameterized.Parameters
   public static Collection<Fraccion[]> byneris(){
       return Arrays.asList (new Fraccion[][] {{new Fraccion(8,9),new Fraccion (3,8), new Fraccion (24,72)}
      , {new Fraccion(8,3),new Fraccion (-2,-3), new Fraccion (-16,-9)}
       ,{new Fraccion(0,3),new Fraccion (-2,9), new Fraccion (0,27)}}); 
   }
    
    
    
    /**
     * Test of sumar method, of class Fraccion.
     * 
     */
    @Test
    public void testMultiplicar(){
        System.out.println("Multiplicar");
        Fraccion result = Fraccion.multiplicar(fraccion1, fraccion2);
        assertEquals(resul.aString(), result.aString());
    }

    
}

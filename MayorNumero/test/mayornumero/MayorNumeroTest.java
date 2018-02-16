/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayornumero;

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
public class MayorNumeroTest {
    
    int lista[];
    
 
    public MayorNumeroTest() {
        
        
    }
   
    @Before
    public void creaLista(){
   lista=new int[]{9,2,3};
    }
    
    @Test
    public void testGetMayor() {
        System.out.println("getMayor");
        int result = MayorNumero.getMayor(lista);
        assertEquals(9, result);
      
     
    }
    
}

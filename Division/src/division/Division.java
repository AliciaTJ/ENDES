/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

/**
 *
 * @author diurno
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    
    public static int division (int numerador, int denominador){
       try{
        return (numerador/denominador);
       }catch (Exception e){
           System.out.println("Se ha producido un error: " + e.getMessage ());
       }
       return 0;
    }
    public static void main(String[] args) {
       System.out.println ("Resultado de la operacion: "+ division(6,3));
        
        
        
    }
    
}

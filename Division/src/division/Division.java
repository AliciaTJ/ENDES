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
    
    public int division (int numerador, int denominador){
       try{
        return (numerador/denominador);
       }catch (Exception e){
           System.out.println("Se ha producido un error: " + e.getMessage ());
       }
       return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
}

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
        return (numerador/denominador);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       try{
        System.out.println("Resultado de la operacion: " + division(2,0));
       }catch (Exception e){
           System.out.println("ERROR");
       }
        
    }
    
}

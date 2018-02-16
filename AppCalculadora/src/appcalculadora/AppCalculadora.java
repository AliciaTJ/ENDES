
package appcalculadora;

/**
 * @Alicia
 */



public class AppCalculadora {
    private int num1;
    private int num2;
    
    /**
     * Costructor 
     * @param a int
     * @param b  int
     */
    public AppCalculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    /**
     * metodo suma dos numeros
     * @return int 
     */
    public int suma() {
        int result = num1 + num2;
        return result;
    }
    
    /**
     * metodo resta dos numeros
     * @return int
     */
    public int resta() {
        int result = num1 - num2;
        return result;
    }
    
    /**
     * metodo multiplica dos numeros
     * @return  int
     */
    public int multiplica() {
        int result = num1 * num2;
        return result;
    }
    /**
     * metodo divide dos numeros
     * @return int
     */
    public int divide() {
        int result = num1 / num2;
        return result;
    }

}

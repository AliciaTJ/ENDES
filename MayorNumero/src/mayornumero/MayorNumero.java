
package mayornumero;

/**
 *
 * @author diurno
 */
public class MayorNumero {

    
    public static int getMayor(int lista[]){
        int indice, max=Integer.MIN_VALUE;
        for (indice=0; indice<lista.length-1; indice++){
            if (lista[indice]>max){
                max=lista[indice];
            }
            }
        return max;
        }
    }
 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppersona;

/**
 * Clase que contiene informacion de una persona
 * @author Alicia
 * @version 0.0
 */
public class Persona {
    //Atributos
    /**
     * Nombre de la perosna
     */
    private String Nombre;
    /**
     * Edad de la persona
     */
    private int Edad;
    /**
     * Sexo de la persona
     */
    private char Sexo;
    /**
     * Constructor de la clase Persona
     * @author Alicia 
     * @param Nombre Nombre de la persona
     * @param Edad Edad de la persona
     */
    public Persona(String Nombre, int Edad){
        this.Nombre=Nombre;
        this.Edad=Edad;
        
    }
    /**
     * Establece nombre de la persona
     * @param Nombre 
     */
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    /**
     * Obtiene el Nombre de la persona
     * @return Nombre de la persona 
     */
    public String getNombre(){
        return Nombre;
    }
    /**
     * Establece edad de la persona
     * @param Edad 
     */
    public void setEdad (int Edad){
        this.Edad=Edad;
    }
    /**
     * Obtiene la edad de la persona
     * @return Edad de la persona
     */
    public int getEdad(){
        return Edad;
    }
    /**
     * Establece sexo de la persona
     * @param Sexo 
     */
    public void setSexo(char Sexo){
        this.Sexo=Sexo;
    }
    /**
     * Obtiene el sexo de la persona
     * @return Sexo de la persona
     */
    public char getSexo(){
        return Sexo;
    }
    /**
     * Método para saludar a persona
     * @return String con saludo
     */
    public String saludo(){
        return "Hola "+getNombre();
    }
    
    
}

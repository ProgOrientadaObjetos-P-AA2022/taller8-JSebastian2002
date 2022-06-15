/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author E.N.D
 */
public class Docente {
    protected String nombre;
    protected String cedula;
    public void establecerNombre(String nb){
        nombre = nb;
    }
    public void establecerCedula(String cd) {
        cedula = cd;
    }
    public String obtenerNombre(){
        return nombre;  
    }
    public String obtenerCedula(){
        return cedula; 
    }


}

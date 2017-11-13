/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author LM8
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;

    public Persona(String n, String a, int e, int c) {
        establecerNombres(n);
        establecerApellidos(a);
        establecerEdad(e);
        establecerCedula(c);   
    }

        
    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }
    
    
    @Override
    public String toString() {

        return String.format("\t%s %s\n%d años de edad \n CI: %d", obtenerNombres(),obtenerApellidos(),obtenerEdad(),obtenerCedula());
    }
    
}

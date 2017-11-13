/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author LM8
 */
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    Trabajador[] trabajadores;

    public Empresa(String n, String s, String c, Trabajador[] tra) {
        establecerNombre(n);
        establecerSiglas(s);
        establecerCiudad(c);
        establecerTrabajadores(tra);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Trabajador[] obtenerTrabajadores() {
        return trabajadores;
    }

    public void establecerTrabajadores(Trabajador[] tra) {
        trabajadores = tra;
    }
    public String ConverJugadores() {
        String ctrabajador = "";
        Trabajador[] arregloTrabajadores = obtenerTrabajadores();

        for (int i = 0; i < arregloTrabajadores.length; i++) {
            ctrabajador += String.format("\t%d)\t%s %s \n\t\t%d años de edad \n\t\tCI: %d\n\t\tSeguro: $%.0f\n\t\tHoras Trabajadas: %d\n\t\tValor x Hora: $%.0f\n\t\tSueldo: %.0f\n",
                    i+1,
                    arregloTrabajadores[i].obtenerNombres(),
                    arregloTrabajadores[i].obtenerApellidos(),
                    arregloTrabajadores[i].obtenerEdad(),
                    arregloTrabajadores[i].obtenerCedula(),
                    arregloTrabajadores[i].obtenerCosto_seguro(),
                    arregloTrabajadores[i].obtenerHoras_trabajadas(),
                    arregloTrabajadores[i].obtenerCosto_por_hora(),
                    arregloTrabajadores[i].obtener_sueldo()
                    
                           
            );
        }
        return ctrabajador;

    }
    
    @Override
    public String toString() {

        return String.format("%s",ConverJugadores());
    }

}

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
public class Trabajador extends Persona {

    private double costo_seguro;
    private int horas_trabajadas;
    private double costo_por_hora;

    public Trabajador(double costs, int h, double costh, String n, String a, int e, int c) {
        super(n, a, e, c);
        establecerCosto_seguro(costs);
        establecerHoras_trabajadas(h);
        establecerCosto_por_hora(costh);

    }

    public double obtenerCosto_seguro() {
        return costo_seguro;
    }

    public void establecerCosto_seguro(double costs) {
        costo_seguro = costs;
    }

    public int obtenerHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void establecerHoras_trabajadas(int h) {
        horas_trabajadas = h;
    }

    public double obtenerCosto_por_hora() {
        return costo_por_hora;
    }

    public void establecerCosto_por_hora(double costh) {
        costo_por_hora = costh;
    }
    
    public double obtener_sueldo(){
        double sueldo=(obtenerHoras_trabajadas()*obtenerCosto_por_hora())+obtenerCosto_seguro();
        return sueldo;
    }
    
    @Override
    public String toString() {

        return String.format("%s \nSeguro: $%.0f\nHoras Trabajadas: %d\nValor x Hora: $%.0f\nSueldo: %.0f\n", super.toString(), obtenerCosto_seguro(), obtenerHoras_trabajadas(), obtenerCosto_por_hora(),obtener_sueldo());
    }

}

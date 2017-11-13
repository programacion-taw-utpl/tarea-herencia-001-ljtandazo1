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
public class EmpresaPrivada extends Empresa {

    private double ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada( double venf, int nums,String n, String s, String c, Trabajador[] tra) {
        super(n, s, c, tra);
        establecerVentas_mensual_fijo(venf);
        establecerNumero_sucursales(nums);
    }

    public double obtenerVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void establecerVentas_mensual_fijo(double venf) {
        ventas_mensual_fijo = venf;
    }

    public int obtenerNumero_sucursales() {
        return numero_sucursales;
    }

    public void establecerNumero_sucursales(int nums) {
        numero_sucursales = nums;
    }

    public Trabajador[] obtenerTrabajadores() {
        return trabajadores;
    }

    public void establecerTrabajadores(Trabajador[] tra) {
        trabajadores = tra;
    }
    @Override
    public String toString() {

        return String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\nVentas: $%.0f\nSucursales: %d\nLista de Trabajadores:\n\n%s", obtenerNombre(),obtenerSiglas(),obtenerCiudad(),obtenerVentas_mensual_fijo(),obtenerNumero_sucursales(),super.toString());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import laempresa.EmpresaPrivada;
import personal.Trabajador;

/**
 *
 * @author LM8
 */
public class Principal {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador(100, 40, 10, "Ana Luisa", "Velez Alcivar", 30, 12903939);
        Trabajador t2 = new Trabajador(100, 50, 10, "Mario Anibal", "Vela Narvaez", 35, 212889);
        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0] = t1;
        trabajadores[1] = t2;

        EmpresaPrivada ep1 = new EmpresaPrivada(200000, 12, "Soluciones Software", "SS´s", "Loja", trabajadores);
        System.out.println(ep1);
    }

}

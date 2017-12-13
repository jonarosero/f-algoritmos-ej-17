/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoArchivo a = new ManejoArchivo();
        a.abrir();
        ArrayList<Estudiante> lista = a.obtenerData();
        Paralelo p = new Paralelo(lista);
        System.out.printf("El promedio de edades del Paralelo es: %.2f\n", p.promedioEdad());

    }
    
}

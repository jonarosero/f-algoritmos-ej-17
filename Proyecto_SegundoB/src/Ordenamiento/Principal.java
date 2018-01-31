/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static int[] transformar_array(ArrayList<Integer> l) {
        int arreglo[] = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arreglo[i] = l.get(i);
        }
        return arreglo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lectura m = new Lectura();
        m.abrir();
        ArrayList<Integer> array = m.obtenerData();
        int[] lista = transformar_array(array);
        int[] lista1 = transformar_array(array);
        int[] lista2 = transformar_array(array);
        Busqueda b = new Busqueda();
        long starTime;

        Insercion insercion = new Insercion(lista);
        Seleccion seleccion = new Seleccion(lista1);
        Combinacion combinacion = new Combinacion(lista2);

        starTime = System.nanoTime();
        insercion.sort(); // ordena el arreglo

        starTime = System.nanoTime();
        seleccion.ordenar(); // ordena el arreglo

        starTime = System.nanoTime();
        combinacion.ordenar(); // ordena el arreglo

        String cadena = String.format("\t\tOrdenamiento de Arreglo:\n"
                + "Arreglo ordenado por inserción:\n%s"
                + "Tiempo usado por insercion: %s ns\n\n"
                + "Arreglo ordenado por selección:\n%s"
                + "Tiempo usado por seleccion: %s ns\n\n"
                + "Arreglo ordenado por combinación:\n%s\n"
                + "Tiempo usado por combinacion: %s ns\n\n", insercion,
                (System.nanoTime() - starTime), seleccion,
                (System.nanoTime() - starTime), combinacion,
                (System.nanoTime() - starTime));
        int num = (int) (Math.random() * 110 + 1);
        int busqueda = b.buscar(lista2, num);

        if (busqueda == -1) {
            cadena += String.format("El número %d no se encuentra", num);
        } else {
            cadena += String.format("El numero %d se encuentra en la posición: %d", num, busqueda);
        }

        ArchivoTexto aplicacion = new ArchivoTexto();
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros(cadena);
        aplicacion.cerrarArchivo();

    }

}

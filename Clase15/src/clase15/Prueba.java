/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Prueba {

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
        ManejoArchivos m = new ManejoArchivos();
        m.abrir();
        ArrayList<Integer> array = m.obtenerData();
        int[] lista = transformar_array(array);
        int[] lista1 = transformar_array(array);
        int[] lista2 = transformar_array(array);
        long starTime;
        

        Insercion insercion = new Insercion(lista);
        Seleccion seleccion = new Seleccion(lista1);
        Combinacion combinacion = new Combinacion(lista2);

        System.out.println("Arreglo desordenado:");
        System.out.println(insercion); // imprime el arreglo desordenado
        
        starTime = System.currentTimeMillis();
        insercion.sort(); // ordena el arreglo

        System.out.println("Arreglo ordenado");
        System.out.println(insercion);
        System.out.println("Tiempo usado por insercion:" + (System.currentTimeMillis()-starTime) + "ms");
        
        starTime = System.currentTimeMillis();
        seleccion.ordenar(); // ordena el arreglo

        
        System.out.println("Tiempo usado por seleccion:" + (System.currentTimeMillis()-starTime) + "ms");
        
        

        starTime = System.currentTimeMillis();
        combinacion.ordenar(); // ordena el arreglo

        
        System.out.println("Tiempo usad por combinacion:" + (System.currentTimeMillis()-starTime) + "ms");

    }

}

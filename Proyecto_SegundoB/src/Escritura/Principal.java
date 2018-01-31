/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escritura;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.Random;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        aplicacion.abrirArchivo();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int n = 100;  //numeros aleatorios 2000000
        int k = n;  //auxiliar;
        int[] numeros = new int[n];
        int[] resultado = new int[n];
        Random rnd = new Random();
        int res;

        //se rellena una matriz ordenada del 1 al 2000000(1..n)
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;

        }
        //se imprime el resultado;

        for (int i = 0; i < n; i++) {
            lista.add(resultado[i]);
        }

        aplicacion.agregarRegistros(lista);
        aplicacion.cerrarArchivo();
    }

}

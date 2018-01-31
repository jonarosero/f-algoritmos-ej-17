/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author USUARIO
 */
public class Seleccion {

    private int[] datos; // arreglo de valores

    // usa el constructor 
    public Seleccion(int[] valores) {
        datos = valores;
    } // fin del constructor de OrdenamientoSeleccion

    // ordena el arreglo usando el ordenamiento por selecci�n
    public void ordenar() {
        int masPequenio; // �ndice del elemento m�s peque�o

        // itera a trav�s de datos.length - 1 elementos
        for (int i = 0; i < datos.length - 1; i++) {
            masPequenio = i; // primer �ndice del resto del arreglo

            // itera para buscar el �ndice del elemento m�s peque�o
            for (int indice = i + 1; indice < datos.length; indice++) {
                if (datos[indice] < datos[masPequenio]) {
                    masPequenio = indice;
                }
            }

            intercambiar(i, masPequenio); // intercambia el elemento m�s peque�o en la posici�n

        } // fin de for exterior
    } // fin del m�todo ordenar

    // m�todo ayudante para intercambiar los valores de dos elementos
    public void intercambiar(int primero, int segundo) {
        int temporal = datos[primero]; // almacena primero en temporal
        datos[primero] = datos[segundo]; // sustituye primero con segundo
        datos[segundo] = temporal; // coloca temporal en segundo
    } // fin del m�todo intercambiar

    // imprime una pasada del algoritmo
    // m�todo para imprimir los valores del arreglo
    public String toString() {
        StringBuilder temporal = new StringBuilder();

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal.append(elemento + "  ");
        }

        temporal.append("\n"); // agrega car�cter de nueva l�nea
        return temporal.toString();
    } // fin del m�todo toString
} // fin de la clase OrdenamientoSeleccion

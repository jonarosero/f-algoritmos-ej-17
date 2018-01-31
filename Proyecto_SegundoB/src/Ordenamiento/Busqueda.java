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
public class Busqueda {

    public int buscar(int[] datos, int num) {
        int fin = datos.length - 1;
        int ini = 0;
        int medio;
        while (ini <= fin) {
            medio = (fin + ini) / 2;
            if (datos[medio] == num) {
                return medio;
            } else {
                if (num < datos[medio]) {
                    fin = medio - 1;
                } else {
                    ini = medio + 1;
                }
            }
        }
        return -1;
    }
}

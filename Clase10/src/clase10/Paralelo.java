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
public class Paralelo {

    ArrayList<Estudiante> listaEstudiantes;

    public Paralelo(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void establecerListaEstudiantes(ArrayList<Estudiante> lista) {
        listaEstudiantes = lista;
    }

    public ArrayList<Estudiante> obtenerListaEstudiante() {
        return listaEstudiantes;
    }

    public double promedioEdad() {
        double valor = 0;
        for (int i = 0; i < this.listaEstudiantes.size(); i++) {
            valor += this.listaEstudiantes.get(i).getEdad();
        }

        return valor / obtenerListaEstudiante().size();
    }

}
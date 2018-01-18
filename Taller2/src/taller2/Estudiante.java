/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Estudiante {
//Atributos de la clase Estudiante
    private String nombres;
    private String apellidos;
    ArrayList<Nota> lista_notas;
//Constructor
    public Estudiante(String nombres, String apellidos, ArrayList<Nota> lista_notas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.lista_notas = lista_notas;
    }
//Metodos Establecer y obtener
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Nota> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Nota> lista_notas) {
        this.lista_notas = lista_notas;
    }
//Metodo para poder imprimir la lista de notas
    public String imprimir_lista() {
        String cadena = "";
        for (Nota notas : this.lista_notas) {
            cadena += notas;
        }
        return cadena;
    }
//Metodo para obtener el promedio de las notas
    public double obtener_promedio() {
        double prom = 0;
        for (int i = 0; i < this.lista_notas.size(); i++) {
            prom += this.lista_notas.get(i).getCalificacion();
        }
        prom = prom / this.lista_notas.size();
        return prom;
    }
//El metodo to String servira para dar formato a la salida por pantalla 
    @Override
    public String toString() {
        return String.format("%s\t|%s\t|%s\t%.2f\n", this.nombres, this.apellidos, this.imprimir_lista(), this.obtener_promedio());
    }

}

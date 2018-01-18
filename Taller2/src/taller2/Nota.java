/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author USUARIO
 */
public class Nota {
//atributos de la clase
    private String asignatura;
    private double calificacion;
//constructor
    public Nota(String asignatura, double calificacion) {
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
//El metodo to String servira para dar formato a la salida por pantalla 
    @Override
    public String toString() {
        return String.format("%.2f(%s)\t|", this.calificacion, this.asignatura);
    }

}

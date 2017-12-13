/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author USUARIO
 */
public abstract class Vehiculo {
    private String matricula;
    private String color;
    private String marca;
    private int dias_alquiler;

    public Vehiculo(String matricula, String color, String marca, int dias_alquiler) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.dias_alquiler = dias_alquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    
    
    public abstract double precio_alquiler();

    @Override
    public String toString() {
        return String.format("\tMatricula: %s\n"
                + "\tColor: %s\n"
                + "\tMarca: %s\n"
                + "\tDias de alquiler: %d", this.getMatricula(), this.getColor(), this.getMarca(), this.getDias_alquiler());
    }
    
    
    
    
}

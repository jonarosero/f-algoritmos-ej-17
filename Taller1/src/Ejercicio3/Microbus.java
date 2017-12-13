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
public class Microbus extends Vehiculo{
    private int num_rutas;
    private double precio;

    public Microbus(String matricula, String color, String marca, int dias_alquiler, int num_rutas) {
        super(matricula, color, marca, dias_alquiler);
        this.num_rutas = num_rutas;
    }

    public int getNum_rutas() {
        return num_rutas;
    }

    public void setNum_rutas(int num_rutas) {
        this.num_rutas = num_rutas;
    }

    @Override
    public double precio_alquiler() {
        precio = (10 * this.num_rutas) + (50 * super.getDias_alquiler());
        return precio;
    }

    @Override
    public String toString() {
        return String.format("Tipo de vehiculo: Microbus\n"
                + "%s\n"
                + "\tNumero de rutas diarias: %d\n"
                + "Percio del alquiler: %.2f\n", super.toString(), this.getNum_rutas(), this.precio_alquiler());
    }
    
    
}

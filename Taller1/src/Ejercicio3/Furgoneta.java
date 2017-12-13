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
public class Furgoneta extends Vehiculo{
    private double precio;

    public Furgoneta(String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
    }

    @Override
    public double precio_alquiler() {
        precio = 100 + (50 * super.getDias_alquiler());
        return precio;
    }

    @Override
    public String toString() {
        return String.format("Tipo de vehiculo: Microbus\n"
                + "%s\n"
                + "Percio del alquiler: %.2f\n", super.toString(), this.precio_alquiler());
    }
    
    
    
}

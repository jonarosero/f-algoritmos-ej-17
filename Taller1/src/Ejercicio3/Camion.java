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
public class Camion extends Vehiculo{
    private int toneladas;
    private double precio;

    public Camion(String matricula, String color, String marca, int dias_alquiler, int toneladas) {
        super(matricula, color, marca, dias_alquiler);
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public double precio_alquiler() {
        precio = (20 * this.getToneladas()) + (50 * super.getDias_alquiler());
        return precio;
    }

    @Override
    public String toString() {
        return String.format("Tipo de vehiculo: Camion\n"
                + "%s\n"
                + "\tNumero de toneladas maxima: %d\n"
                + "Percio del alquiler: %.2f\n", super.toString(), this.getToneladas(), this.precio_alquiler());
    }
    
    
}

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
public class Coche extends Vehiculo{
    private int num_pasajeros;
    private double precio;

    public Coche(String matricula, String color, String marca, int dias_alquiler, int num_pasajeros) {
        super(matricula, color, marca, dias_alquiler);
        this.num_pasajeros = num_pasajeros;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    @Override
    public double precio_alquiler() {
        precio = (5 * this.num_pasajeros) + (50 * super.getDias_alquiler());
        return precio;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo Tipo: Coche\n"
                + "%s\n"
                + "\tNumero de pasajeros: %d\n"
                + "Precio del alquiler: %.2f\n", super.toString(), this.getNum_pasajeros(), this.precio_alquiler());
    }
    
    
    
    
    
}

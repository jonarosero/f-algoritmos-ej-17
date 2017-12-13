/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo ch =  new Coche("LAB-356", "BLANCO", "MERCEDES", 5, 4);
        Vehiculo mb = new Microbus("LORZ-478", "AZUL", "CHEVROLET", 2, 7);
        Vehiculo ca = new Camion("PIUE-666", "ROJO", "TOYOTA", 9, 25);
        Vehiculo fg = new Furgoneta("TEL-777", "VERDE", "VOLKSVAGEN", 200);
        
        ArrayList <Vehiculo> lista =  new ArrayList<Vehiculo>();
        lista.add(ch);
        lista.add(mb);
        lista.add(ca);
        lista.add(fg);
        
        for (Vehiculo vehiculos: lista){
            System.out.println(vehiculos);
        }
    }
    
}

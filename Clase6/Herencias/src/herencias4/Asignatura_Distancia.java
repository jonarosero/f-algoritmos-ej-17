/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias4;

/**
 *
 * @author USUARIO
 */
public class Asignatura_Distancia extends Asignatura {
    private int numero_creditos;

    public Asignatura_Distancia(String nombre, String tipo, double costo, int n) {
        super(nombre, tipo, costo);
        this.setNumero_creditos(n);
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }

    @Override
    public String toString() {
        return String.format("Asignatura Presencia:%s\n\t\t\tNumero horas: %d\n", super.toString(), this.getNumero_creditos());
    }
    
}

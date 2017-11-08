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
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;

    public Asignatura(String nombre, String tipo, double costo) {
        this.setNombre(nombre);
        this.setTipo(tipo);
        this.setCosto(costo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return String.format("\t%s\n\t\t\t%s\n\t\t\t%.2f", this.getNombre(), this.getTipo(), this.getCosto());
    }
    
    
    
}

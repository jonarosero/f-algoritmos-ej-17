/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona {
    private double sueldo;
    
    public Profesor(){
        super("Rene", "Elizalde", 33);
        setSueldo(1001);
    }

    public Profesor(double s) {
        super("Rene", "Elizalde", 33);
        setSueldo(s);
    }
    
    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        setSueldo(s);
    }
    
    public void setEdad(int e){
        if(e < 30){
            edad = 30;
        }else{
            edad = e;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
    
    
    
}

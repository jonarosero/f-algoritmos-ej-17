/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import herencias4.Asignatura;
import herencias4.Asignatura_Presencial;


/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura_Presencial [] asignaturas;
    
    public Estudiante(String n, String a, int e, int n_a){
        super(n, a, e);
        this.asignaturas = new Asignatura_Presencial[n_a];
    }

    public String getAsignaturas() {
        String result = "";
        for (Asignatura_Presencial asignatura: this.asignaturas){
            result += asignatura; 
        }
        return result;
    }

    public void setAsignaturas(int i, Asignatura_Presencial asignatura) {
        this.asignaturas[i] = asignatura;
    }
    
    public double obtener_valor(){
        double valor = 0;
        for (int i = 0; i < this.asignaturas.length; i++){
            valor += this.asignaturas[i].getCosto();
        }
        return valor;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s\n"
                + "Costo matricula: %.2f\n"
                + "Listado de asignaturas:\n"
                + "%s", super.toString(), this.obtener_valor(), this.getAsignaturas());
    }
}

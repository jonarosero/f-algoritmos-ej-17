/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println("Estudiante");
        System.out.println(e);
        
        Profesor p = new Profesor(10001);
        System.out.println(p.getNombre());
        
        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());
        
        Profesor p2 = new Profesor("Jonathan", "Rosero", 35, 12000.99);
        System.out.println("Profesor");
        System.out.println(p2);
        
        Estudiante e1 = new Estudiante("Jorge", "Hurtado", 15, 1499.99);
        System.out.println("Estudiante");
        System.out.println(e1);
        
        Profesor p3 = new Profesor("Jonathan", "Rosero", 21, 12000.99);
        System.out.println("Profesor");
        System.out.println(p3);
    }
    
}

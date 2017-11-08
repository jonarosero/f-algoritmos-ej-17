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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura_Presencial ap = new Asignatura_Presencial("Programacion", "Comun", 100, 80);
        System.out.println(ap);
        
        Asignatura_Distancia ad = new Asignatura_Distancia("Literatura", "Troncal", 300, 6);
        System.out.println(ad);
    }
    
}

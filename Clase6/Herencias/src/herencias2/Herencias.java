package herencias2;

import herencias4.Asignatura;

import herencias4.Asignatura_Presencial;

public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 2);
        Asignatura_Presencial ap = new Asignatura_Presencial("Programacion", "Comun", 100, 80);
        Asignatura_Presencial ap2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 6);
        e.setAsignaturas(0, ap);
        e.setAsignaturas(1, ap2);
        System.out.println(e);
        
    }
    
}

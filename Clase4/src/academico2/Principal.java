package academico2;

public class Principal {

    public static void main(String[] args) {
        Carrera c = new Carrera("Presencial", "Contabilidad");
        Asignatura a = new Asignatura(c);
        System.out.println(a);
        
        Carrera c2 = new Carrera("Distancia", "Economia");
        Asignatura a2 = new Asignatura(c2);
        System.out.println(a2);
    }
    
}

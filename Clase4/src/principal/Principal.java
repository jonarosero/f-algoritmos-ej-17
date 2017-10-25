package principal;

import carrera.Carrera;

public class Principal {

    public static void main(String[] args) {
        Carrera c = new Carrera();
        
        c.establecer_Nombre("Informatica");
        c.establecer_Modalidad("Distancia");
        System.out.println(c.obtener_Modalidad());
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_Modalidad());
        
        Carrera c3 = new Carrera("Sistemas", "semipresencial");
        
        System.out.println(c3.obtener_Modalidad());
        
        c3.establecer_Modalidad("distancia");
        System.out.println(c3.obtener_Modalidad());
        
        c3.establecer_Modalidad(c3.obtener_Modalidad().toUpperCase());
        System.out.println(c3.obtener_Modalidad());
        
        
    }
    
}

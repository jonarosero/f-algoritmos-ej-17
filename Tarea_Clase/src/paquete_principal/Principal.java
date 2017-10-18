package paquete_principal;

import institucion.Asignatura;
import personal_docente.Docente;
import personal_docente.Titulo;

public class Principal {

    public static void main(String[] args) {
        Asignatura a1 = new Asignatura();
        a1.ingresar_Nombre("Matemáticas");
        a1.ingresar_Creditos(8);
        
        Asignatura a2 = new Asignatura();
        a2.ingresar_Nombre("Física");
        a2.ingresar_Creditos(6);
        
        Titulo t1 = new Titulo();
        t1.ingresar_Nombre("Licenciado en Físico-Matemáticas");
        t1.ingresar_Nombre_universidad("Universidad Politécnica");
        
        Titulo t2 = new Titulo();
        t2.ingresar_Nombre("Magister en Docencia Matemática");
        t2.ingresar_Nombre_universidad("Universidad Valenciana");
        
        Docente d1 = new Docente();
        
        d1.ingresar_Nombre("Luis V.");
        d1.ingresar_Apellido("Perez J.");
        d1.ingresar_Asignatura1(a1);
        d1.ingresar_Asignatura2(a2);
        d1.ingresar_Titulo_tercer_nivel(t1);
        d1.ingresar_Titulo_cuarto_nivel(t2);
        
        System.out.println(d1);

        a1.ingresar_Nombre("Sociales");
        a1.ingresar_Creditos(9);
        
        a2.ingresar_Nombre("Literatura");
        a2.ingresar_Creditos(10);
        
        t1.ingresar_Nombre("Licenciado en Ciencias Sociales");
        t1.ingresar_Nombre_universidad("Universidad Politécnica");

        t2.ingresar_Nombre("Magister en Docencia Social");
        t2.ingresar_Nombre_universidad("Uniersidad Cataluña");
        
        Docente d2 = new Docente();
        
        d2.ingresar_Nombre("Ana M.");
        d2.ingresar_Apellido("Velez P."); 
        d2.ingresar_Asignatura1(a1);
        d2.ingresar_Asignatura2(a2);
        d2.ingresar_Titulo_tercer_nivel(t1);
        d2.ingresar_Titulo_cuarto_nivel(t2);
        
        System.out.println(d2);
//        Asignatura a1 = new Asignatura();
//        a1.ingresar_Nombre("Matematicas");
//        a1.ingresar_Creditos(4);
//
//        Asignatura a2 = new Asignatura();
//        a2.ingresar_Creditos(3);
//        a2.ingresar_Nombre("Fisica");
//
//        Titulo tercer_nivel = new Titulo();
//        tercer_nivel.ingresar_Nombre("Ing. Sistemas informaticos");
//        tercer_nivel.ingresar_Nombre_universidad("Utpl");
//
//        Titulo cuarto_nivel = new Titulo();
//        cuarto_nivel.ingresar_Nombre("Master en Ciencias de la Computacion");
//        cuarto_nivel.ingresar_Nombre_universidad("Pontificia Universidad Tecnica de Ambato");
//
//        Docente dt = new Docente();
//        dt.ingresar_Nombre("Jonathan A.");
//        dt.ingresar_Apellido("Rosero Soto");
//        dt.ingresar_Asignatura1(a1);
//        dt.ingresar_Asignatura2(a2);
//        dt.ingresar_Titulo_tercer_nivel(tercer_nivel);
//        dt.ingresar_Titulo_cuarto_nivel(cuarto_nivel);
//
//        System.out.println(dt);

    }

    
}

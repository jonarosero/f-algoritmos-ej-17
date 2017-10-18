package personal_docente;

import institucion.Asignatura;

public class Docente {
    private String nombre;
    private String apellido;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_Apellido() {
        return apellido;
    }

    public void ingresar_Apellido(String apellido) {
        this.apellido = apellido;
    }

    public Asignatura obtener_Asignatura1() {
        return asignatura1;
    }

    public void ingresar_Asignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura obtener_Asignatura2() {
        return asignatura2;
    }

    public void ingresar_Asignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Titulo obtener_Titulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void ingresar_Titulo_tercer_nivel(Titulo titulo_tercer_nivel) {
        this.titulo_tercer_nivel = titulo_tercer_nivel;
    }

    public Titulo obtener_Titulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void ingresar_Titulo_cuarto_nivel(Titulo titulo_cuarto_nivel) {
        this.titulo_cuarto_nivel = titulo_cuarto_nivel;
    }

    
    public String ToString(){
        return String.format("DATOS DEL DOCENTE:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas de: \n"
                + "\tAsignatura 1: %s\n"
                + "\tAsignatura 2: %s\n"
                + "El docente tiene los siguientes titulos academicos:\n"
                + "\tTitulo 3er nivel: %s\n"
                + "\tTitulo 4to nivel: %s\n", obtener_Nombre(), obtener_Apellido(), obtener_Asignatura1(), obtener_Asignatura2(), obtener_Titulo_tercer_nivel(), obtener_Titulo_cuarto_nivel());
        
        
    }
    
    
}

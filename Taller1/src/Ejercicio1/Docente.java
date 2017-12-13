package Ejercicio1;

public class Docente {
    private String nombre;
    private String apellido;
    private String titulo;

    public Docente(String nombre, String apellido, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Titulo: %s", this.getNombre(), this.getApellido(), this.getTitulo());
    }
    
    
    
}

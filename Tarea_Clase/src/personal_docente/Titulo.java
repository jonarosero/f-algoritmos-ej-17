package personal_docente;

public class Titulo {
    private String nombre;
    private String nombre_universidad;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_Nombre_universidad() {
        return nombre_universidad;
    }

    public void ingresar_Nombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %d", obtener_Nombre(), obtener_Nombre_universidad());
        
    }
    
}

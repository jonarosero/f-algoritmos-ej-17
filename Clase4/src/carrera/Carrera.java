package carrera;

public class Carrera {
    private String nombre;
    private String modalidad;

    public Carrera() {
        modalidad = "distancia";
    }

    public Carrera(String md) {
        this.modalidad = md;
    }

    public Carrera(String x, String md) {
        this.nombre = x;
        this.modalidad = md;
    }

    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_Modalidad() {
        return modalidad;
    }

    public void establecer_Modalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
    
    
    
}

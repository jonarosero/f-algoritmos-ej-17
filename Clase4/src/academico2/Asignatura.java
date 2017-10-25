package academico2;

public class Asignatura {
    
    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura() {
        
    }

    public Asignatura(Carrera carrera) {
        this.nombre = "Informatica";
        this.creditos = 5;
        this.carrera = carrera;
    }

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_Creditos() {
        return creditos;
    }

    public void ingresar_Creditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera obtener_Carrera() {
        return carrera;
    }

    public void ingresar_Carrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public String toString(){
        String cadena = String.format("Asignatura\n"
                + "\tNombre: %s\n"
                + "\tCreditos: %d\n"
                + "%s", this.obtener_Nombre(), this.obtener_Creditos(), this.obtener_Carrera());
        return cadena;
    }
    
    
    
}

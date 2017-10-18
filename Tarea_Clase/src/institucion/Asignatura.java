package institucion;

public class Asignatura {

    private String nombre;
    private int creditos;

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
    @Override
    public String toString(){
        return String.format("%s con una cantidad de creditos: %d", obtener_Nombre(), obtener_Creditos());
        
    }
    
    
}

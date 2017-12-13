package clase10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ManejoArchivo {

    private Scanner scan;

    public void abrir() {

        try {
            scan = new Scanner(new File("archivo1.csv"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }

    }
    
    public ArrayList<Estudiante> obtenerData() {
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        try {
            while (scan.hasNext()) {
                String cadena = scan.nextLine();
                ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split("\\|")));

                String nombre = registro.get(0);
                String apellidos = registro.get(1);
                int edad = Integer.parseInt(registro.get(2));
                Estudiante e = new Estudiante(nombre, apellidos, edad);
                lista.add(e);
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            scan.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
        return lista;
    }
    
    public void cerrarArchivo(){
        if (scan != null)
            scan.close();
    }

}

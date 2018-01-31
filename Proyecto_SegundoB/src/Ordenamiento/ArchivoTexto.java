/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    public void abrirArchivo() {
        try {
            // salida = new Formatter("registrosNN.txt");
            salida = new Formatter(new FileWriter("datos_ordenados.csv"));

        } catch (SecurityException securityException) {
            System.err.println("No se tiene acceso de escritura a este archivo");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear archivo");
            System.exit(1);

        } catch (IOException e) {
            System.err.println("Error al crear archivo");
            System.exit(1);
        }
    }

    public void agregarRegistros(String cadena) {

        try {

            salida.format("%s", cadena);

        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Entrada inválida.Intente de nuevo");
        }

    }

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    }
}

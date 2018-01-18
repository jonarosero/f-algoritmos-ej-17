/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        aplicacion.abrirArchivo();

        System.out.println("Ingrese la cantidad de alumnos");
        int cant = scan.nextInt();
        //Se crea un arreglo que guarde la cantidad de estudiantes
        ArrayList<Estudiante> lista_est = new ArrayList<Estudiante>();
        for (int i = 0; i < cant; i++) {
            //SE INGRESAN LOS DATOS DE CADA ALUMNO MEDIANTE UN CICLO FOR
            scan.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = scan.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese el nombre de la asignatura: ");
            String asig1 = scan.nextLine();
            System.out.printf("Ingrese la nota de la asignatura: %s\n", asig1);
            double nota = scan.nextDouble();
            scan.nextLine();
            System.out.println("Ingrese el nombre de la asignatura: ");
            String asig2 = scan.nextLine();
            System.out.printf("Ingrese la nota de la asignatura: %s\n", asig2);
            double nota2 = scan.nextDouble();
            ArrayList<Nota> lista_notas = new ArrayList();
            lista_notas.add(new Nota(asig1, nota));
            lista_notas.add(new Nota(asig2, nota2));
            lista_est.add(new Estudiante(nombre, apellido, lista_notas));
        }

        //System.out.printf("NOMBRE\t\t|APELLIDO\t|\tNOTA 1\t\t|NOTA 2\t|\t\tPROMEDIO\n");
        //Se presenta
        /*for (int i = 0; i < lista_est.size(); i++) {
            System.out.printf("%s", lista_est.get(i));

        }
        */
        aplicacion.agregarRegistros(lista_est);
        aplicacion.cerrarArchivo();

    }

}

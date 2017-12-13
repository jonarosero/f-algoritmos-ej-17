package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jonathan grupo 006
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n_alumno, ap_alumno, n_doc1, ap_doc1, titulo1, n_doc2, ap_doc2, titulo2;
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        int cont = 0;
        int op, op2;
        
        do{
            System.out.printf("1.Ingresar alumnos\n2.Mostrar alumnos\n3.Salir\n-> ");
            op = scan.nextInt();
            switch(op){
                case 1:
                    do{
                        scan.nextLine();
                        System.out.println("Ingrese el nombre del alumno");
                        n_alumno = scan.nextLine();
                        System.out.println("Ingrese el apellido del alumno");
                        ap_alumno = scan.nextLine();
                        System.out.println("Ingrese el nombre del docente de programacion");
                        n_doc1 = scan.nextLine();
                        System.out.println("Ingrese el apellido del docente de programacion");
                        ap_doc1 = scan.nextLine();
                        System.out.println("Ingrese el titulo del docente de programacion");
                        titulo1 = scan.nextLine();
                        System.out.println("Ingrese el nombre del docente de base de datos");
                        n_doc2 = scan.nextLine();
                        System.out.println("Ingrese el apellido del docente de base de datos");
                        ap_doc2 = scan.nextLine();
                        System.out.println("Ingrese el titulo del docente de base de datos");
                        titulo2 = scan.nextLine();
                        Docente doc1 = new Docente(n_doc1, ap_doc1, titulo1);
                        Docente doc2 = new Docente(n_doc2, ap_doc2, titulo2);
                        Alumno alum = new Alumno(n_alumno, ap_alumno, doc1, doc2);
                        cont++;
                        alumnos.add(alum);
                        System.out.printf("Desea ingresar otro alumno: \n1.Si\n2.No\n-> ");
                        op2 = scan.nextInt();
                        
                    }while(op2 == 1);
                    break;
                    
                case 2:
                    for (Alumno alumno: alumnos){
                        System.out.println(alumno);
                    }
                    System.out.println("El total de alumnos es: " +cont);
                    break;
                    
                default:
                    break;
            }
            
        }while(op != 3);
    }
    
}

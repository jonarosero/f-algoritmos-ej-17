package clase1;

import java.util.Scanner;

public class Clase1 {

    
    public static void main(String[] args) {
        // imprimir tabla de multiplicar hasta el 12
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        
        for (int i = 0; i <= 12; i++ ){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
    
}

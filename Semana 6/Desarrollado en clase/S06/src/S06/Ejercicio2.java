
package S06;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //variable
        int edad=-1;
        
        while (edad<0) {
            System.out.println("Ingrese su edad: ");
            edad= scan.nextInt();       
            scan.nextLine();
            
        }
        
        System.out.println("Edad ingresada: "+ edad);
    }
}

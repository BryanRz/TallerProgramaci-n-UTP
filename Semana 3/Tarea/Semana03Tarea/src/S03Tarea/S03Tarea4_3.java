package S03Tarea;

import java.util.Scanner;

/**
Realizar un programa donde al ingresar un número divisible entre 2 se vea si 
también es divisible entre 3.
*/

public class S03Tarea4_3 {
    //Crear una clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        System.out.println("Ingrese un numero:");
        int numero = scan.nextInt();
        //Proceso
        if (numero % 2 == 0) {
            if (numero % 3 == 0) {
                //Salida
                System.out.println("El numero es divisible entre 2 y 3.");
            } else {
                //Salida
                System.out.println("El numero es divisible entre 2 pero no entre 3.");
            }
       }
    }
}

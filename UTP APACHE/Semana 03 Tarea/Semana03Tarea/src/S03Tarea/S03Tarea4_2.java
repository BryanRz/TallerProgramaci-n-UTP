package S03Tarea;

import java.util.Scanner;

/**
Realizar un programa donde se pida un número y ver si es positivo o negativo
y si es par o impar.
*/

public class S03Tarea4_2 {
    //Crear una clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = scan.nextInt();
        //Proceso
        if (num > 0) {
            System.out.println("Su numero es positivo.");
        }else{
            if (num<0) {
                System.out.println("Su numero es negativo.");
            } else {
                System.out.println("Su numero es 0");}
        }
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Su numero es par.");
            } else {
                System.out.println("Su numero es impar.");
            }
        }
    }
}

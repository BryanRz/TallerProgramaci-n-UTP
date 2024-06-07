package S03Tarea;

import java.util.Scanner;

/**
Realice un programa donde se ingresen dos números y verificar 
si es divisible uno de otro.
*/

public class S03Tarea4_4 {
    //Crear una clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        int num1, num2;
        System.out.println("Ingrese su primer numero entero: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese su segundo numero entero: ");
        num2 = scan.nextInt();
        //Proceso
        if (num2!=0) {
            if (num1 % num2 == 0) {
                //Salida
                System.out.println(num1 + " es divisible por " + num2);
            }else{
                //Salida
                System.out.println(num1 + " no es divisible por " + num2);
            }
        }else{
            //Salida
            System.out.println("El segundo numero no puede ser igual a 0, favor de colocar otro numero.");
        }
    }
}

package Tarea;

import java.util.Scanner;

/*
Escribir un programa para generar los N primeros números de la serie de Fibonacci, donde N es un valor entero positivo ingresado por el usuario (validar)
Mostrar además al final, la suma de los números mostrados.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int n, num1 = 0, num2 = 1, tot, suma = 0;
        //Proceso
        do {
            //Salida
            System.out.println("Ingrese el numero de numeros de la serie de Fibonacci");
            n = scan.nextInt();
            System.out.println("Serie de Fibonacci de " + n + ":");
        } while (n < 0);
        for (int i = 1; i <= n; i++) {
            System.out.print(num2 + ", ");
            suma = suma + num2;
            tot = num1 + num2;
            num1 = num2;
            num2 = tot;
        }
        //Salida
        System.out.println("");
        System.out.println("Suma de numeros: " + suma);
    }
}

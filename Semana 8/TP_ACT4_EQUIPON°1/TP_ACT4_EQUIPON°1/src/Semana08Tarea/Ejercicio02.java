package Semana08Tarea;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        int num = 1, num1 = 1, numfin;
        int suma = num; 
        System.out.print("Ingrese un numero: ");
        numfin = scan.nextInt();
        
        // Proceso
        System.out.println(String.format("La serie de Fibonacci de %d términos es: ", numfin));
        System.out.print(String.format("%d ", num)); 
        
        for (int i = 1; i < numfin; i++) {
            System.out.print(String.format("%d ", num1)); 
            suma += num1; 
            int siguiente = num + num1;
            num = num1;
            num1 = siguiente;
        }
        
        System.out.println(String.format("\nLa suma es: %d", suma));
    }
}




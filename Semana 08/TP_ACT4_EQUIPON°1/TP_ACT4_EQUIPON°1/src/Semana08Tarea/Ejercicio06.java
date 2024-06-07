package Semana08Tarea;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numF;
        System.out.println("Ingrese la cantidad de filas a mostrar");
        numF=scan.nextInt();
        //Para mostrar la cantidad exacta de filas
       
        // Primera parte
        for (num = 1; num <= numF; num++) {
            for (int aux = 1; aux <= num; aux++) {
                System.out.print("@");
            }
            // Espacios entre figuras
            for (int i = 0; i < 2 * (numF - num); i++) {
                System.out.print(" ");
            }
            for (int aux = 1; aux <= num; aux++) {
                System.out.print("@");
            }
            System.out.println("");
        }

        // Segunda parte
        for (num = numF ; num > 0; num--) {
            for (int aux = 1; aux <= num; aux++) {
                System.out.print("@");
            }
            // Espacios entre figuras
            for (int i = 0; i < 2 * (numF - num); i++) {
                System.out.print(" ");
            }
            for (int aux = 1; aux <= num; aux++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
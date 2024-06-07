package RepasoS02;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Entrada
        Scanner scan = new Scanner(System.in);
        int num, sum1, sum2, sum3, sum4;
        System.out.println("Ingrese el número de 4 cifras: ");
        num = scan.nextInt();
        //Proceso
        if (num > 999 && num < 10000) {
            sum1 = num / 1000;
            sum2 = sum1 + (num/100) % 10;
            sum3 = sum2 + (num/10) % 10;
            sum4 = sum3 + (num/1 % 10);
            //Salida
            System.out.println("La suma de cifras es: "+sum4);
        } else {
            //Salida
            System.out.println("El número no es de 4 cifras.");
        }
    }
}

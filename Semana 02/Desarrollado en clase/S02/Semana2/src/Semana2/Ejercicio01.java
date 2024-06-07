
package Semana2;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args) {
            int num, sum1, sum2, sum3;

          Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un n�mero de 3 cifras");
        num = scan.nextInt();

        if (num > 99 && num < 1000 ) {
            sum1 = (num / 100);
            sum2 = sum1 + (num / 10) % 10;
            sum3 = sum2 + (num % 10);

            System.out.println("Suma de digitos es: " + sum3);
        }else{
            System.out.println("Numero invalido");
        }
    }
}

package S03;

import java.util.Scanner;

/**
Se requiere saber si 3 números enteros ingresados 
* se encuentran o no en progresión aritmética. 
* Las variables leídas son: n1, n2 y n3.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //entrada: Declaración de variables
        int n1, n2, n3;
        System.out.println("Ingrese el 1er valor:");
        n1=scan.nextInt();
        System.out.println("Ingrese el 2do valor:");
        n2=scan.nextInt();
        System.out.println("Ingrese el 3er valor:");
        n3=scan.nextInt();
        //proceso
        if (n2-n1==n3-n2) {
            //salida
            System.out.println("Progresión aritmética");
        }else{
            //salida
            System.out.println("No es una progresión aritmética");
        }
        
    }
}


package S07;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Diseñar un programa para imprimir N números naturales 
        //con sus respectivos cuadrados y cubos.
        
        /*
        5
        1  = al cuadrado 1, al cubo 1
        2  = al cuadrado 4, al cubo 8
        3  = al cuadrado 9, al cubo 27
        4  = al cuadrado 16, al cubo 64
        5  = al cuadrado 25, al cubo 125              
        
        */
        //variable
        int num, cont=1;
        
        System.out.println("Ingrese un N°:");
        num= scan.nextInt();
        
        do {
            //instrucciones
            System.out.println(cont+"= al cuadrado\t"+ (cont*cont)+ "\talcubo\t"+ (cont*cont*cont));
            cont++;
        } while (cont<=num);
    }
}

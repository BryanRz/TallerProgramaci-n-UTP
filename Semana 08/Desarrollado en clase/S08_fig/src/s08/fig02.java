/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s08;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN
 */
public class fig02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1, numF;

        // Primera mitad del patrón (creciente)
        System.out.println("Ingrese el numero de filas a generar");
        numF = scan.nextInt();
        //Para mostrar exactamente la cantidad de filas
        numF=numF/2;
        do {            
            for (int i = numF- num; i > 0; i--) {
                
                System.out.print(" ");
            }
            for (int i = 1; i <=num; i++) {
                System.out.print("@");
            }
            // Espacios en blanco
            System.out.println("");
            num++;
        } while (num<=numF);
        
        num = numF;

        // Segunda mitad del patrón (decreciente)
        do {
            for (int i = numF - num; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= num; i++) {
                System.out.print("@");
            }

            // Espacios en blanco
            System.out.println("");
            num--;
        } while (num > 0);       
    }
    
}

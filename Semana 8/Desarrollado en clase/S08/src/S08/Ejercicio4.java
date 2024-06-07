/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingrese un N°");
        int num=scan.nextInt();
           //for
        int suma=0;
        System.out.println("Número de impares");
        for (int i = 1; i <=num; i+=2) {
            System.out.println(i);
            suma=suma+i;
        }
        //mostrar
        System.out.println("La suma N° impares:"+ suma);
    }
}

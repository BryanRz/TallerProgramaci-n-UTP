/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S09;

import java.util.Scanner;

/**
 *
 * @author c19024
 */
public class Ejercicio5 {
     //MOstrar los numeros aleatorios del 1 al 100
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        //clase scanner
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de N°");
        int num= scan.nextInt();
        
        int aleatorio[]= new int[num];
        int sum=0;
        //Almacenar los N° aleatorios
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i]= (int)(Math.random()*100+1);
            sum+=aleatorio[i];
            //agregar los numeros aleatorios
            //del arreglo
            sb.append(aleatorio[i]);
            //1, 5, 8, 10, 8
            if (i<(aleatorio.length)-1) {
                sb.append(", ");
            }
        }
        System.out.println("Los números son:");
        //Mostrar los números
        for (int i = 0; i < aleatorio.length; i++) {
            System.out.println(aleatorio[i]);
        }
        
        //salida
        System.out.println("Números: "+sb.toString());
        System.out.println("La suma: "+sum);
    }
}

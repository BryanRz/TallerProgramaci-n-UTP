package S09;

import java.util.Scanner;

/**Lea por teclado 4 números enteros y 
* guardelos en un array
Calcule y muestre el promedio de los valores 
* que estan en el arreglo 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //declaración y creación del arreglo
        int numeros[]= new int[4];
        double prom, suma=0;
        
        //solicitar y almacenar los números
        for (int i = 0; i < 4; i++) {
             System.out.println("Ingrese un N°:");
             numeros[i]=scan.nextInt();
             
        }
        //acumulando los 4 numeros
        for (int i = 0; i < 4; i++) {
            suma+=numeros[i];
        }
               
                
       //promedio
       prom=suma/4;
       
       //salida
        System.out.println("Resultados");
        System.out.println("Promedio: "+prom);
        
    }
}

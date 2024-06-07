/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08;

/**
Recuerda: 
 @
 @@
 @@@
 @@@@
 @@@@@
 @@@@@@
 @@@@@@@
 @@@@@@@@
 @@@@@@@@@
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        //recordar while
        int ini=1, fini=9;
        while (ini<=fini) {
            //muestra la cantidad
            int aux=1;
            while (aux<=ini) {
                System.out.print("@");
                aux++;
            }
            System.out.println(" ");
            ini++;
        }
        System.out.println("*******************");
         int ini1=9, fini1=1;
         while (ini1>=fini1) {
            //muestra la cantidad
            int aux=1;
            while (aux<=ini1) {
                System.out.print("@");
                aux++;
            }
            System.out.println(" ");
            ini1--;
        }
        
        System.out.println("Usando FOR");
        //for   
        for (int i = 1; i <= 9; i++) {        
            for (int j = 1; j <=i; j++) {
                  System.out.print("@");
            }
            System.out.println(" ");
        }
    }
  
}

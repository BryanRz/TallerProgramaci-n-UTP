/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06;

/**
 *
 * @author C19024
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        //mostrar 1 al 50 números, sólo los múltiplos de 5
        //sin utilizar e
        //hallar la sumatoria de esos números
        int num=0, sum=0;
        
        System.out.println("Números del 1 al 50");
        
        while (num<=50) {
            //sumar
            sum=sum+num;
            System.out.println(num);
            num+=5;
            
        }
        System.out.println("La sumatoria es: "+sum);//275
        
        
    }
}

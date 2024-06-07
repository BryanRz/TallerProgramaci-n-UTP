/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07;

/**
//Mostrar la tabla de multiplicación de un rango de número
* 1
* 1*1=1
* 1*12=12
* 2
* 3
* 4
* 5
* 6 
* 7
* 8
* 9
* 9*1=9
* 9*12=108
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Usando Do while");
        int numIni1=1, numFin1=9;
        
        do {
            System.out.println("Tabla "+ numIni1);
            int aux1=1;
            do {
                //System.out.printf("%d * %2d = %3d\n", numIni1,aux1,(numIni1*aux1));
                System.out.println(numIni1+"*"+aux1+"="+(numIni1*aux1));
                aux1++;
            } while (aux1<=12);
            
            System.out.println("");
            numIni1++;
        } while (numIni1<=numFin1);
    }
}

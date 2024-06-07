/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08;

/**
 * Mostrar números del 1 al 10 1-10=-9
 *
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //for
        System.out.println("Usando For");
        //agrego variable
        //int z = 10;
//        for (int i = 1; i <=10; i++) {
//            //System.out.println(i+"-"+z+"="+(i-z));
//            System.out.printf("%d - %d = %d\n", i,z,i-z);
//            z--;
//        }
        for (int i = 1, z = 10; i <= 10; i++,z--) {
            //System.out.println(i+"-"+z+"="+(i-z));
            System.out.printf("%d - %d = %d\n", i, z, i - z);
            
        }
    }
}

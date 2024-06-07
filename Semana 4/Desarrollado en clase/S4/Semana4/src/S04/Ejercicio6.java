/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S04;

/**
Operador ternario
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //Mayor de edad
        //variable
        int edad=8;
        /*
        if (edad>=18) {
            System.out.println("Es mayor de edad");
        }else{            
            System.out.println("Aun no eres mayor de edad");
        }*/
        //operador ternario
        String mensaje=(edad>=18)?"Es mayor de edad":"Aun no eres mayor de edad";
        System.out.println(mensaje);
    }
}

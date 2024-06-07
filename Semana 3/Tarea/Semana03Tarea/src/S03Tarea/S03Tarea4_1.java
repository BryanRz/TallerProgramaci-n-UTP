package S03Tarea;

import java.util.Scanner;

/**
Hacer un programa que indique cuando sea mayor que 10 aplique el 10%,
pero cuando sea mayor que 20 aplique el 20%.
*/

public class S03Tarea4_1 {
    //Crear una clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        int num;
        double total, desc = 0;
        System.out.println("Ingrese un numero: ");
        num = scan.nextInt();
        //Proceso
        if (num > 10) {
            desc = 0.1;
            if (num > 20) {
                desc = 0.2;
            }
        }
        total = num - (num * desc);
        //Salida
        System.out.println("El descuento es: "+desc);
        System.out.println("El monto total a pagar es: "+total);
    }
}
    


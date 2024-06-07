package S03Tarea;

import java.util.Scanner;

/**
Una tienda tiene descuento de 20% todos los domingos,
se pide solicitar el nombre y el día en la que viene el cliente.
*/

public class S03Tarea1 {
    //Crear una clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        String diaSemana, nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese un dia de la semana: ");
        diaSemana = scan.nextLine();
        //Proceso
        if (diaSemana.equalsIgnoreCase("Domingo")) {
            //Salida
            System.out.println("Hola " + nombre + ", obtienes un 20% de descuento.");
        }else{
            //Salida
            System.out.println("Hola " + nombre + ", no obtiene descuento, vuelva un domingo.");
        }
    }
}

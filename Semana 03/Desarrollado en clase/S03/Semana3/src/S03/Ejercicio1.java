package S03;

import java.util.Scanner;

/**
Una joyería aplica un descuento si el cliente ha 
comprado productos por un monto no menor de 2500 soles.
*icho monto está almacenado en la variable montoCompra.

 */
public class Ejercicio1 {
    //crear una clase principal
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Entrada: Declaración de variables
        double montoCompra;
        System.out.println("Ingrese el monto de COMPRA");
        montoCompra=scan.nextDouble();
        //proceso
        if (montoCompra>=2500) {
           //salida 
            System.out.println("Felicidades, tienes un descuento");
        }
        
    }
}

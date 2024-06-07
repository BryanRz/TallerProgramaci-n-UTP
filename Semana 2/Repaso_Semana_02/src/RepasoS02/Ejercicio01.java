package RepasoS02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Entrada: Declaración de variables
        Scanner scan = new Scanner(System.in);
        double monto;
        double tamara, josue, caleb, daniel, david;
        System.out.println("Ingrese la cantidad de monto: ");
        monto = scan.nextDouble();
        josue = 0.27 * monto;
        daniel = 0.25 * monto;
        tamara = 0.85 * josue;
        caleb = 0.23 * (josue + daniel);
        david = monto - (josue+daniel+tamara+caleb);
        //Salida
        System.out.println("El monto que recibira Tamara es: "+ tamara + " soles.");
        System.out.println("El monto que recibira Josue es: "+ josue);
        System.out.println("El monto que recibira Caleb es: "+ caleb);
        System.out.println("El monto que recibira Daniel es: "+daniel);
        System.out.println("El monto que recibira David es: "+david);
    }
}

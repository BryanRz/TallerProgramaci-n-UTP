package RepasoS02;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String carrera;
        int promedio;
        double pago = 0, descuento = 0, importe = 0;
        
        System.out.println("Ingrese la carrera: ");
        carrera = scan.nextLine();
        
        System.out.println("Ingrese el promedio ponderado: ");
        promedio = scan.nextInt();
        
        if (carrera.equalsIgnoreCase("ingenieria")) {
            pago = 1500;
        } else if (carrera.equalsIgnoreCase("administracion")) {
            pago = 1000;
        } else if (carrera.equalsIgnoreCase("medicina")) {
            pago = 2000;
        } else {
            System.out.println("Carrera no válida.");
        }
        
        if (promedio < 0 || promedio > 20) {
            System.out.println("Ingrese un promedio válido (entre 0 y 20).");
        } else if (promedio >= 0 && promedio < 11) {
            descuento = 0.00;
        } else if (promedio >= 11 && promedio < 15) {
            descuento = 0.05;
        } else if (promedio >= 15 && promedio < 19) {
            descuento = 0.10;
        } else {
            descuento = 1.00;
        }
        
        importe = pago - (descuento * pago);
        
        System.out.println("El importe total es: " + importe + " soles.");
    }
}

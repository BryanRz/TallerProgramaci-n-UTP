package Tarea03;
//Implementar un programa que imprima un ticket de operación de un agente bancario

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String cuenta, tipoOperacion;
        double monto;
        System.out.println("Ingrese el número de cuenta: ");
        cuenta = scan.nextLine();
        System.out.println("Ingrese el tipo de operación: ");
        tipoOperacion = scan.nextLine();
        System.out.println("Ingrese el monto: ");
        monto = scan.nextDouble();
        
        //Impresión del ticket bancario
        
        System.out.println("**************************");
        System.out.println("      TICKET BANCARIO     ");
        System.out.println("**************************");
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Tipo de operación: " + tipoOperacion);
        System.out.println("Monto: $" + monto);
        System.out.println("**************************");
        
    }
}

    
    
       
    


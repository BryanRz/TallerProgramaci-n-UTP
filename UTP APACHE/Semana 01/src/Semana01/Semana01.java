package Semana01;

import java.util.Scanner;

    public class Semana01 {
        //Clase principal
        public static void main(String[] args) {
            //
            System.out.println("Hola UTP");
            //Declaración de variables
            String nombre, carrera;
            int edad;
            double sueldo;
            
            //Class scanner
            Scanner scan=new Scanner (System.in);
            
            System.out.println("Ingrese el nombre: ");
            nombre = scan.nextLine();
            
            System.out.println("Ingrese su carrera: ");
            carrera = scan.nextLine();
            
            System.out.println("Ingrese su edad: ");
            edad = scan.nextInt();
            
            System.out.println("Ingrese su sueldo: ");
            sueldo = scan.nextDouble();
            
            //Salida
            
            System.out.println("Resumen del estudiante: ");
            System.out.println("Nombre del estudiante: "+nombre);
            System.out.println("Carrera del estudiante: "+carrera);
            System.out.println("Edad del estudiante: "+edad);
            System.out.println("Sueldo del estudiante: "+sueldo);
            
        }
    
}

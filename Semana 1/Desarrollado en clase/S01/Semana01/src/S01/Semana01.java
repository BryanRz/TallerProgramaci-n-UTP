package S01;
//Guardar: control + s

import java.util.Scanner;


public class Semana01 {
  //clase principal
    public static void main(String[] args) {
        //salida sout + tecla tab
        System.out.println("Hola! UTP");
        //Declaración de variables
        String nombre, carrera;
        int edad;
        double sueldo;
        
        //Clase Scanner: entrada de datos por teclado
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        nombre=scan.nextLine();
        
        System.out.println("Ingrese su carrera:");
        carrera=scan.nextLine();
        
        //agregar edad y sueldo: 
        System.out.println("Ingrese su edad: ");
        edad=scan.nextInt();
        System.out.println("Ingrese su sueldo: ");
        sueldo=scan.nextDouble();
        
        
        //salida: Resumen de datos
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Nombre del estudiante: "+nombre);
        System.out.println("Carrera del estudiante: "+carrera);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        
    }
 
    
}

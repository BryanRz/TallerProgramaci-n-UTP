package S03Tarea;

import java.util.Scanner;


public class S03Tarea2 {
    //Crear un clase principal
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        //Entrada: Declaración de variables
        int n1,n2,n3,n4,n5;
        double notaTotal;
        System.out.println("Ingrese su Primera nota:");
        n1=scan.nextInt();
        System.out.println("Ingrese su Segunda nota:");
        n2=scan.nextInt();
        System.out.println("Ingrese su Tercera nota:");
        n3=scan.nextInt();
        System.out.println("Ingrese su Cuarta nota:");
        n4=scan.nextInt();
        System.out.println("Ingrese su Quinta nota:");
        n5=scan.nextInt();
        //Proceso
        notaTotal=(n1+n2+n3+n4+n5)/5;
            //Salida
            System.out.println("Su nota es de: "+notaTotal);
        if (notaTotal>=12) {
            //Salida
            System.out.println("Usted aprobo el curso.");
        }else{
            if (notaTotal<12) {
                //Salida
                System.out.println("Usted no aprobo el curso.");
            }
        }
    }
}
        


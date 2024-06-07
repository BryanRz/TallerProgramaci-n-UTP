/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S04;

/**
 *
 * @author C19024
 */
public class Ejercicios_varios {
   /* int nota;
        String mensaje="Usted obtuvo la mencion de #mencion#";
         System.out.println("Ingrese la nota");
         nota=scan.nextInt();
         switch(nota){
             case 0,1,2,3,4,5,6,7,8,9,10,11,12:
                 String mensaje2=mensaje.replace("#mencion#", "Deficiente");
                 System.out.println(mensaje2);
                 break;
             case 13,14,15:
                  String mensaje3=mensaje.replace("#mencion#", "Regular");
                  System.out.println(mensaje3);
                  break;
             case 16,17,18:
                  String mensaje4=mensaje.replace("#mencion#", "Bueno");
                  System.out.println(mensaje4);
                  break;
             case 19,20:
                 String mensaje5=mensaje.replace("#mencion#", "Excelente");
                 System.out.println(mensaje5);
                 break;
             default: 
                 System.out.println("Ingrese otra nota");
         }*/
    
    /*
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int nota;
        String mensaje1="USTED OBTUVO LA MENCIÓN DE X";
        String mensaje2="";
        
        System.out.println("INGRESE LA NOTA DEL ALUMNO");
        nota=scan.nextInt();
        
        switch (nota) {
            case 20,19: mensaje2=mensaje1.replace("X", "EXCELENTE");break;
            case 18,17,16: mensaje2=mensaje1.replace("X", "BUENO");break;
            case 15,14,13: mensaje2=mensaje1.replace("X", "REGULAR");break;
            case 12,11,10,9,8,7,6,5,4,3,2,1,0: mensaje2=mensaje1.replace("X", "DEFICIENTE");break;
        
        }
        System.out.println(mensaje2);
        
    }
    */
    
    /*
    package Semana04;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Ingrese la nota del alumno");
        int nota=scan.nextInt();
        
        String mencion=nota>18?"Excelente":
                nota>15?"Bueno":
                nota>=13?"Regular":"Deficiente";
        
        String mensaje1="Usted tuvo la mención de #mencion#";
        String mensaje2=mensaje1.replace("#mencion#",""+mencion);     
                
        System.out.println("El mensaje1, "+mensaje1+", va a ser reemplazado por el mensaje2, "+mensaje2);
    }
}
    */
}

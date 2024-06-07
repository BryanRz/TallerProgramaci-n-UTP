package S07;
import java.util.Scanner;
/*1!=1
2!=1*2=2
3!=1*2*3=6
4!=1*2*3*4=24
5!=1*2*3*4*5=120
*///Factorial
public class Ejercicio4 {
    public static void main(String[] args) {        
        Scanner scan= new Scanner(System.in);
        //Variables
        int num, fact=1, cont=1; 
        
        System.out.println("Ingrese un  número:");
        num= scan.nextInt();
        
        do {//proceso
            fact=fact*cont;
            cont++;            
        } while (cont<=num);
        
        //salida
        System.out.println("El factorial de "+fact);
    }
}

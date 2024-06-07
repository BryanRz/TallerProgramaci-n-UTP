package S07Tarea;
import java.util.Scanner;

public class S07Tarea2 {
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

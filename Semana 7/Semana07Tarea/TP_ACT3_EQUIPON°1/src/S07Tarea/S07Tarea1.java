package S07Tarea;
import java.util.Scanner;

public class S07Tarea1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Determinar si es primo o no
        //Variables
        int num, cantDiv=0, cont=1;
        
        System.out.println("Ingrese un N�mero:");
        num= scan.nextInt();
        
        do {           
            //condici�n
            if (num%cont==0) {
                cantDiv++;
            }
            cont++;
            
        } while (cont<=num);
        
        //condicional 
        if (cantDiv==2) {
            System.out.println("Es Primo");
        }else{
            System.out.println("No es primo");
        }
    }
}

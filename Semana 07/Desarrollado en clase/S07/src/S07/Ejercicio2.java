package S07;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Tabla de multiplicar de un N°
        Scanner scan = new Scanner(System.in);
        //variables
        int cont=1, num;
        
        System.out.println("Ingrese un número: ");
        num= scan.nextInt();
        
        do {
            //forma 
            //8*1=8
            //8*2=16
            System.out.println(num +" * "+cont+"="+(num*cont));
            //System.out.printf("%d x %2d = %3d\n", num, cont, num*cont);
            cont++;
            
        } while (cont<=12);
        
        
    }
}

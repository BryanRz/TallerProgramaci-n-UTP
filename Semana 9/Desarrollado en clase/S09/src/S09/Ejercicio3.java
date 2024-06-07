
package S09;

import java.util.Scanner;

/*crear un arreglo de 12 posiciones que 
almacene los mese de año, luego muestre el mes 
según el número ingresado*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //declarar e inicializar el arreglo
        String meses[]={"Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio", "Julio", 
        "Agosto", "Setiembre", "Octubre"
                ,"Noviembre","Diciembre"};
        
        //Ingrese un número:
        System.out.println("Ingrese un N°:");
        int num= scan.nextInt();
        
        //salida
        System.out.println("El número ingresado "
                + "corresponde al mes de: "+meses[num-1]);
        
    }
}

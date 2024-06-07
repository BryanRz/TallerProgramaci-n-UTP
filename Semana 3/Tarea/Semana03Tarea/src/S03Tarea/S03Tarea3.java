package S03Tarea;

import java.util.Scanner;

/**
Se obsequiará un bono monetario para aquellas familias que tengan mas de 5 integrantes,
por lo cual se necesita saber la cantidad de integrantes en su familia
*/

public class S03Tarea3 {
    //Crear un clase principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declaración de variables
        int hijos;
        System.out.println("Buen dia, ingrese la cantidad de miembros en su famlia");
        hijos= scan.nextInt();
        //Proceso
        if (hijos>=5) {
            //Salida
            System.out.println("Felicidades, es beneficiario del bono");
        } else {
            //Salida
            System.out.println("Lo sentimos, no es beneficiario del bono");
        }
    }
}

package PC2_RUIZALCAZAR;

import java.util.Scanner;

/*
Apellidos y nombres: Ruiz Alcazar Bryan Clyder
CÓDIGO DE ESTUDIANTE: U23231771
*/
/*
Desarrolle código en java que permita mostrar la siguiente salida de datos (Utiliza la estructura "Do - While", con la clase Scanner).
7
1111
151515
19191919
2323232323
272727272727
31313131313131
272727272727
2323232323
19191919
151515
1111
7
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        //Asignar variables
        Scanner scan = new Scanner(System.in);
        int num = 7;
        //Proceso
        do {
            //Salida
            for (int i = 0; i < num; i++) {
                System.out.print(num);
            }
            System.out.println();
            num += 4;
        } while (num <= 31);
        
        do {
            //Salida
            for (int i = 0; i < num; i++) {
                System.out.print(num);
            }
            System.out.println();
            num -= 4;
        } while (num >= 7);
    }
}

package RepasoS02;

import java.util.Scanner;

/*
La municipalidad de Pueblo Libre piensa invertir cierto monto de dinero en la reparación de
las pistas en las avenidas principales. Cada avenida recibirá un monto equivalente a:
▪ Av. La Mar: 35% del monto recibido por Av. Bolivar
▪ Av. 28 de Julio: 25% del monto recibido
▪ Av. Bolivar: 10% de lo recibido por la Av. 28 de Julio y Av. Clement
▪ Av. Clement: 15% del monto recibido
▪ Av. Sucre: lo que queda del resto.
Dado el monto a invertir, desarrolle un programa que determine cuánto dinero le
corresponde a cada avenida.
*/
public class Ejercicio02 {
    public static void main(String[] args) {
        //Entrada
        Scanner scan=new Scanner(System.in);
        double monto;
        double lamar, julio, bolivar, clement, sucre;
        System.out.println("Ingrese el monto: ");
        monto=scan.nextDouble();
        //Proceso
        julio=0.25*monto;
        clement=0.15*monto;
        bolivar=0.10*(julio + clement);
        lamar=0.35*bolivar;
        sucre=monto-(julio+bolivar+clement+lamar);
        //salida
        System.out.println("El monto para Av. La mar es: "+ lamar+" soles");
        System.out.println("El monto para Av. 28 ed julio es: "+ julio+" soles");
        System.out.println("El monto para Av. Bolivar es: "+ bolivar+" soles");
        System.out.println("El monto para Av. Clement es: "+ clement+" soles");
        System.out.println("El monto para Av. Sucre es: "+ sucre+" soles");
        
    }
}

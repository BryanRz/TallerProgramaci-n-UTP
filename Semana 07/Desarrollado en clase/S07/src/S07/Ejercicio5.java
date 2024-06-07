
package S07;
/*
*
**
***
****
*****
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        //usando while
        int numIni=1, numFin=9;
        
        while (numIni<=numFin) {
            //varaible aux
            int aux=1; //cantidad de veces
            while (aux<=numIni) {
                System.out.print("*");
                aux++;
            }
            System.out.println("");
            numIni++;
        }
        
        System.out.println("Usando Do while");
        int numIni1=1, numFin1=9;
        do {
            int aux1=1;
            do {
                System.out.print("*");
                aux1++;
            } while (aux1<=numIni1);
            
            System.out.println("");
            numIni1++;
        } while (numIni1<=numFin1);
    }
}

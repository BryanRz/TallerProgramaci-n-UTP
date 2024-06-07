package S06;
/**
 1
 22
 333
 4444
 55555
 666666
 7777777
 88888888
 999999999
 */
public class Ejercicio8 {
    //estructura while anidada
    public static void main(String[] args) {
        //Declaración de variables
        int ini=1, fini=9;
        
        while (ini<=fini) {
            //variables aux, cantidad de veces a mostrar
            int aux=1;
            while (aux<=ini) {
                System.out.print(ini);
                aux++;
            }
            System.out.println("");
            ini++;
            
        }
        
    }
    
}

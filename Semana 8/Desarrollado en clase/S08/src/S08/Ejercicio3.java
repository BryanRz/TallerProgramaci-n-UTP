package S08;
/*Realizar un código java para ingresar N números naturales 
e imprimir la suma total de los mismos*/

/*10
55
*/


public class Ejercicio3 {
    public static void main(String[] args) {
         //for
        int suma=0;
        System.out.println("Usando For");
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            suma=suma+i;
        }
        //mostrar
        System.out.println("La suma "+ suma);
    }
}

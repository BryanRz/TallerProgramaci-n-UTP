package S09;
/*Mostrar numeros entre a y b, siendo a= 5 y b=20
en un tamaño 10
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        //declarar y crear el arreglo
        int aleatorio[]= new int[10];
        //Almacenar los Numeros
        for (int i = 0; i < 10; i++) {
            aleatorio[i]=(int)(Math.random()*(20-5+1)+5);
        }
        //mostrar los numeros
        System.out.println("Números: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(aleatorio[i]);
        }
        
    }
}

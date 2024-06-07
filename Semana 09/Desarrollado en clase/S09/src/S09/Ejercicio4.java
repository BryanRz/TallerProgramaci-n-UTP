package S09;
/**arreglo aleatorio*/
public class Ejercicio4 {
    //MOstrar los numeros aleatorios del 1 al 10
    public static void main(String[] args) {
        int aleatorio[]= new int[10];
        
        //Almacenar los N° aleatorios
        for (int i = 0; i < 10; i++) {
            aleatorio[i]= (int)(Math.random()*10+1);
        }
        System.out.println("Los números son:");
        //Mostrar los números
        for (int i = 0; i < 10; i++) {
            System.out.println(aleatorio[i]);
        }
    }
}

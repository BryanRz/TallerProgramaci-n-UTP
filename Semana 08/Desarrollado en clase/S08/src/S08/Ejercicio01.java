
package S08;
//Mostrar los 10 primeros numeros
public class Ejercicio01 {
    public static void main(String[] args) {
        //while
        //variable
        int num=1;
        System.out.println("Usando while");
        while (num<=10) {
            System.out.println(num);
            num++;
        }
                
        //do while
        int num1=1;
        System.out.println("Usando Do while");
        do {
            System.out.println(num1);
            num1++; 
        } while (num1<=10);
        
        //for
        System.out.println("Usando For");
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
}

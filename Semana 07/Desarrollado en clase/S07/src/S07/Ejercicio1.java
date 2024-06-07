
package S07;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Recordando While = mientras
        //Mostrar números del 1 al 20
        //variable
        int num=1, suma=0;//contador, acumulador
        
        System.out.println("Usando While");
        while (num<=5) {
            suma=suma+num;//suma+=num
            System.out.println(num);
            num++;            
        }
        System.out.println("La suma de los números: "+suma);
        
        
        
        //do while
        //variables
        System.out.println("Usando Do while");
        int num1=1, suma1=0;
        do {
            suma1=suma1+num1;//suma+=num
            System.out.println(num1);//1
            num1++; //2
        } while (num1<=5);
        System.out.println("La suma de los números: "+suma1);
    }
 
}

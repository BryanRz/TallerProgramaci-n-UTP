package S03;
import java.util.Scanner;
/*Equipo A
Una persona se puede jubilar si tiene 65 años o más,
en el caso de los hombres, y 60 como mínimo, 
en el caso de las mujeres. 
Las variables leídas son: sexo y edad. 
Determinar si la persona puede jubilarse.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Entrada: Declaración de variables
        String sexo;
        int edad;
        System.out.println("Ingrese su genero");
        sexo= scan.next();
        System.out.println("Ingrese su edad");
        edad= scan.nextInt();
        
        //proceso
        if (sexo.equalsIgnoreCase("M")) {
            if(edad>=65){
                //salida
                System.out.println("Puede jubilarse");
            }else{
                System.out.println("Aun te falta");
            }
        }else{
            if (sexo.equalsIgnoreCase("F")) {
            if(edad>=60){
                System.out.println("Puede jubilarse");
            }else{
                System.out.println("Aun te falta");
            }
        }
        
        
    }
}
}

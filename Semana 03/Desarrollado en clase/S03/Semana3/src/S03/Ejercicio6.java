package S03;
import java.util.Scanner;
/**
El gobierno ha decretado un aumento en los 
* salarios de los altos funcionarios de acuerdo 
* a la siguiente escala:
*       SALUD   EDUC.   TRANSPORTE
* F     25%     12%         20%
* M     20%     11%         15%
Los salarios actuales son: Salud (S/.15000), 
* Educación (S/.12000), Transporte (S/. 18000)
Escribir un programa en Java que solicite el sexo y
* sector de un funcionario y calcular el monto que 
* percibirá luego de aplicado el aumento. */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Entrada: Declración de variables
        String sexo, sector;
        double aumento=0;
        
        System.out.println("Ingrese el genero");
        sexo=scan.next();
        System.out.println("Ingrese el sector");
        sector=scan.next();
        
        //proceso
        if (sexo.equalsIgnoreCase("F")) {
            if (sector.equalsIgnoreCase("Salud")) {
                aumento=(15000*0.25)+15000;                
            }else if(sector.equalsIgnoreCase("educacion")){
                aumento=(12000*0.12)+12000;
            }else if(sector.equalsIgnoreCase("transporte")){
                aumento=(18000*0.20)+18000;
            }
        }
        
        //SALIDA
        System.out.println("***********************");
        System.out.println(" Muestra de resultados ");
        System.out.println("***********************");
        System.out.println("El nuevo salario es: "+aumento);
        
        
    }
}

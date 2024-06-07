package Ejercicio01;
//Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y 
//permita calcular el porcentaje de hombres y mujeres.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantHombres, cantMujeres, totalEstudiantes;
        double porcHombres, porcMujeres;
        System.out.println("Ingrese la cantidad de hombres: ");
        cantHombres = scan.nextInt();
        System.out.println("Ingrese la cantidad de mujeres: ");
        cantMujeres = scan.nextInt();

        totalEstudiantes = cantHombres + cantMujeres;

        porcHombres = (cantHombres * 100.0)/totalEstudiantes;
        porcMujeres = (cantMujeres * 100.0)/totalEstudiantes;

        //Mostrar los resultados
        System.out.println("El porcentaje de hombres es: "+porcHombres);
        System.out.println("El porcentaje de mujeres es: "+porcMujeres);
        System.out.println("El porcentaje de hombres es: " + new DecimalFormat("##.##").format(porcHombres));
        System.out.println("El porcentaje de mujeres es: " + new DecimalFormat("##.##").format(porcMujeres));
    }
}

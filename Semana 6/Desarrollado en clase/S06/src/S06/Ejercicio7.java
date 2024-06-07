package S06;

import java.util.Scanner;

/*Haga un código que pregunte repetitivamente si va 
a participar en una encuesta (s/n) Tras responder ?si
solicite el sueldo del trabajador. 
Cuando la respuesta sea ?no muestre el promedio 
de sueldos registrados.*/
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        String resp;
        double sueldo, prom = 0, suma = 0;
        int cont = 0;

        System.out.println("Desea participar en una encuesta(si/no)?");
        resp = scan.next();

        //estructura while
        while (resp.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el sueldo");
            sueldo = scan.nextDouble();
            //incremento
            cont++;
            //incremento acumulador
            suma = suma + sueldo;

            System.out.println("Desea participar en una encuesta(si/no)?");
            resp = scan.next();
            
            //promedio
            prom = suma / cont;
        }

        //salida
        System.out.println("Resultados");
        System.out.println("Cantidad de sueldos:"+ cont);
        System.out.println("Suma de sueldos: "+suma);
        System.out.println("Promedio: " + prom);

    }
}

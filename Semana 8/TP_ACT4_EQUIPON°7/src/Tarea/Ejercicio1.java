package Tarea;

import java.util.Scanner;

/*
Elaborar un programa que permita ingresar mediante un menú la información de un empleado, su salario y sus boletas emitidas​.
Opcion1: Se debe pedir el nombre y el tipo de empleado (contratado o nombrado)​
Opción2: Se debe ingresar el salario mensual, número de boletas emitidas y número de mes en curso​.
Opción 3: Elaborar el reporte ASCII (validar que los datos hayan sido ingresados)​
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        String nom = "", tip = "";
        double salar = 0;
        int numb = 0, nummes = 0, opc;
        //Procedimiento
        do {
            System.out.println("¿Qué operación desea realizar?\n"
                    + "Opcion 1: Ingresar el nombre y tipo del empleado\n"
                    + "Opcion 2: Ingresar el salario mensual, numero de boletas emitidas y numero de mes en curso\n"
                    + "Opcion 3: Elaborar el reporte ASCII");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado: ");
                    nom = scan.nextLine();
                    nom = scan.nextLine();
                    System.out.println("¿Qué tipo de empleado es? (contratado o nombrado)");
                    tip = scan.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese el salario mensual del empleado: ");
                    salar = scan.nextDouble();
                    System.out.println("Numero de mes en curso:");
                    nummes = scan.nextInt();
                    do {
                        System.out.println("Numero de boletas emitidas: ");
                        numb = scan.nextInt();
                    } while (numb > nummes);

                    break;
                case 3:
                    //Salida
                    System.out.println("*****************Informacion del empleado*****************\n"
                            + "Nombre del empleado: " + nom.toUpperCase() + "\nTipo de empleado: " + tip.toUpperCase() + "\n"
                            + "Datos del salario\nSalario mensual: S/" + salar + "\nBoletas emitidas: " + numb + "\n"
                            + "Numero de mes en curso: " + nummes + "\nBoletas restantes: " + (nummes - numb) + "\n"
                            + "Monto total pagado: S/" + (salar * nummes));
                    break;
                default:
                    System.out.println("Inrese una opcion valida");
                    break;
            }
        } while (opc != 3);
    }
}

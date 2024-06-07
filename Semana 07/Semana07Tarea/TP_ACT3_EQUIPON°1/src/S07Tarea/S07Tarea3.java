package S07Tarea;

import java.util.Scanner;

public class S07Tarea3 {
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String apellidos = "";
        double sueldoMensual = 0;
        int opcion;

        do {//proceso
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar nombre y apellidos del empleado");
            System.out.println("2. Ingresar sueldo mensual");
            System.out.println("3. Generar reporte ASCII");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //salida
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = scanner.next();
                    System.out.print("Ingrese los apellidos del empleado: ");
                    apellidos = scanner.next();
                    System.out.println("Datos del empleado ingresados correctamente.");
                    break;
                case 2:
                    boolean salarioValido = false;
                    do {
                        //salida
                        System.out.print("Ingrese el sueldo mensual: ");
                        sueldoMensual = scanner.nextDouble();
                        if (sueldoMensual <= 0) {
                            //salida
                            System.out.println("Error: El sueldo debe ser mayor que cero.");
                        } else {
                            salarioValido = true;
                            //salida
                            System.out.println("Sueldo mensual ingresado correctamente.");
                        }
                    } while (!salarioValido);
                    break;
                case 3:
                    if (nombre.isEmpty() || apellidos.isEmpty() || sueldoMensual <= 0) {
                        //salida
                        System.out.println("Error: Debe ingresar primero los datos del empleado y el salario.");
                    } else {
                        //salida
                        System.out.println("\n--- Reporte ASCII ---");
                        System.out.println("Nombre del empleado: " + nombre + " " + apellidos);
                        System.out.println("Sueldo mensual: $" + sueldoMensual);
                    }
                    break;
                case 4:
                    //salida
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    //salida
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}


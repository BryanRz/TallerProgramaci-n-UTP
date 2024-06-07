package Semana08Tarea;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner scan = new Scanner(System.in);
        String nombre = "", tipoEmpleado = "";
        double salarioMensual = 0.00;
        int numeroBoleta = 0, numeroMes = 0;
        boolean datosIngresados = false;
        boolean salarioIngresado = false;

        //Usando un bucle for con un número grande para que actúe como un bucle infinito
        for (int i = 0; i < 100; i++) {
            System.out.println("Menu:");
            System.out.println("1. Ingresar información del empleado");
            System.out.println("2. Ingresar salario y boletas emitidas");
            System.out.println("3. Generar reporte");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = scan.nextLine();
                    System.out.print("Ingrese el tipo de empleado (contratado o nombrado): ");
                    tipoEmpleado = scan.nextLine();
                    datosIngresados = true;
                    break;
                case 2:
                    if (datosIngresados) {
                        System.out.print("Ingrese el salario mensual: ");
                        salarioMensual = scan.nextDouble();
                        System.out.print("Ingrese el número de boletas emitidas: ");
                        numeroBoleta = scan.nextInt();
                        System.out.print("Ingrese el número del mes en curso: ");
                        numeroMes = scan.nextInt();
                        salarioIngresado = true;
                    } else {
                        System.out.println("Primero debe ingresar la información del empleado (opción 1).");
                    }
                    break;
                case 3:
                    if (salarioIngresado && datosIngresados) {
                        String tipoContrato = tipoEmpleado.equalsIgnoreCase("contratado") ? "[X] Contratado [ ] Nombrado" : "[ ] Contratado [X] Nombrado";
                        String[] meses = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SET", "OCT", "NOV", "DIC"};
                        StringBuilder reporte = new StringBuilder()
                        .append("################################################\n")
                        .append("#           RESUMEN DE BOLETAS DE PAGO         #\n")
                        .append("################################################\n")
                        .append(String.format("# Empleado: %-32s   #\n", nombre.toUpperCase()))
                        .append(String.format("# Tipo:    %-33s   #\n", tipoContrato))
                        .append("################################################\n")
                        .append("# Datos del Salario                   Boleta   #\n");
                        for (int j = 0; j < numeroMes; j++) {
                            String boleta = (j < numeroBoleta) ? "SI" : "NO";
                            reporte.append(String.format("# Salario %s: S/. %.2f              %s     #\n", meses[j], salarioMensual, boleta));
                        }
                        reporte.append("################################################\n")
                        .append(String.format("# Boletas emitidas: %d  Boletas Restantes: %d    #\n", numeroBoleta, numeroMes - numeroBoleta))
                        .append(String.format("# Monto total pagado: S/. %.2f              #\n", salarioMensual * numeroMes))
                        .append("################################################\n");
                        System.out.println(reporte.toString());
                    } else {
                        System.out.println("Primero debe ingresar toda la información requerida (opciones 1 y 2).");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    i = 100; // Terminar el bucle
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }
    }
}
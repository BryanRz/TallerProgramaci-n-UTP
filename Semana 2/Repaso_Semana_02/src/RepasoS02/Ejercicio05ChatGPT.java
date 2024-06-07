package RepasoS02;

import java.util.Scanner;

public class Ejercicio05ChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del paciente
        System.out.println("Ingrese el código del paciente:");
        int codigoPaciente = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        System.out.println("Ingrese apellidos y nombres del paciente:");
        String apellidosNombres = scanner.nextLine();

        System.out.println("Ingrese la edad del paciente:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el peso del paciente (en kg):");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la talla del paciente (en metros):");
        double talla = scanner.nextDouble();

        System.out.println("Ingrese el sexo del paciente (M para masculino, F para femenino):");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); // Consumir el salto de línea después de next()

        System.out.println("Ingrese el costo por día de internamiento:");
        double costoPorDia = scanner.nextDouble();

        System.out.println("Ingrese los días de internamiento:");
        int diasInternamiento = scanner.nextInt();

        System.out.println("Ingrese la especialidad en la que se atiende (cirugía, neurología o cardiología):");
        String especialidad = scanner.next();

        // Variables para costos adicionales específicos de la especialidad
        double costoLaboratorio = 0;
        double costoEquipos = 0;

        if (especialidad.equalsIgnoreCase("cirugía")) {
            System.out.println("Ingrese el costo por laboratorio:");
            costoLaboratorio = scanner.nextDouble();
        } else if (especialidad.equalsIgnoreCase("cardiología")) {
            System.out.println("Ingrese el costo por equipos:");
            costoEquipos = scanner.nextDouble();
        }

        // Calcular importe a pagar
        double importeAPagar = (costoPorDia * diasInternamiento) + costoLaboratorio + costoEquipos;

        // Mostrar resultado
        System.out.println("\nDatos del paciente:");
        System.out.println("Código del paciente: " + codigoPaciente);
        System.out.println("Apellidos y nombres: " + apellidosNombres);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Talla: " + talla + " m");
        System.out.println("Sexo: " + sexo);
        System.out.println("Costo por día de internamiento: $" + costoPorDia);
        System.out.println("Días de internamiento: " + diasInternamiento);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Costo por laboratorio: $" + costoLaboratorio);
        System.out.println("Costo por equipos: $" + costoEquipos);
        System.out.println("\nImporte a pagar: $" + importeAPagar);

        // Cerrar el scanner
        scanner.close();
    }
}

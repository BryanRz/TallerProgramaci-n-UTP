package RepasoS02;

import java.util.Scanner;

/*
Diseñe un algoritmo que ingrese los datos de un paciente de un hospital: código del paciente,
apellidos y nombres, edad, peso, talla, sexo, costo por día de internamiento, días de
internamiento, especialidad en la que se atiende (puede ser cirugía, neurología o cardiología),
costo por laboratorio (solo para cirugía) y costo por equipos (solo para cardiología). Se pide
calcular e mostrar el importe a pagar por el paciente.
*/
public class Ejercicio05 {
    public static void main(String[] args) {
            //Entrada
            Scanner scan = new Scanner(System.in);
            String nombres, apellidos, sexo, especialidad;
            int codigo, dias, edad;
            double peso, talla, costoDias, costoLab, costoEquipo, suma= 0;
            //Proceso
            System.out.println("Ingrese el codigo del paciente: ");
            codigo=scan.nextInt();
            System.out.println("Ingrese el nombre: ");
            nombres=scan.next();
            System.out.println("Ingrese el apellido: ");
            apellidos=scan.next();
            System.out.println("Ingrese el sexo: ");
            sexo=scan.next();
            System.out.println("Ingrese la talla: ");
            talla=scan.nextDouble();
            System.out.println("Ingrese la edad: ");
            edad=scan.nextInt();
            System.out.println("Ingrese los días de internamiento: ");
            dias=scan.nextInt();
            System.out.println("Ingrese el costo de los días de internamiento: ");
            costoDias=scan.nextDouble();
            System.out.println("Ingrese la Especialidad ");
            especialidad=scan.next();
            
            if (especialidad.equalsIgnoreCase("cirugía")){
                    System.out.println("Ingresar el costo de Laboratorio: ");
                    costoLab=scan.nextDouble();
                    suma = (costoLab) + (dias*costoDias);
            }else if (especialidad.equalsIgnoreCase("cardiología")) {
                    System.out.println("Ingrese el costo por equipo: ");
                    costoEquipo=scan.nextDouble();
                    suma = (costoEquipo) + (dias*costoDias);
            }else if (especialidad.equalsIgnoreCase("neurologia")) {
                    System.out.println("no hay costo adicional");
                    suma = (dias*costoDias);
        }
            System.out.println("El total a pagar es: "+suma+ " soles.");
            }
    }


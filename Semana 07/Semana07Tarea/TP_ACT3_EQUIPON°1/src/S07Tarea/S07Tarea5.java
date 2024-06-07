package S07Tarea;

import java.util.Scanner;

public class S07Tarea5 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        String expresion;

        do {//proceso
            System.out.print("Ingrese una expresión de la forma ab=N: ");
            expresion = scanner.nextLine();
        } while (!validarExpresion(expresion));

        char a = expresion.charAt(0);
        char b = expresion.charAt(1);
        int n = Integer.parseInt(expresion.substring(3));

        generarFila(a, b, n, 0);
    }

    public static boolean validarExpresion(String expresion) {
    // Verificar que la expresión tenga el formato correcto
    if (expresion.length() < 4 || expresion.indexOf('=') != 2) {
        System.out.println("La expresión no tiene el formato correcto.");
        return false;
    }

    // Verificar que los caracteres a y b sean diferentes
    char a = expresion.charAt(0);
    char b = expresion.charAt(1);
    if (a == b) {
        System.out.println("Los caracteres a y b deben ser diferentes.");
        return false;
    }

    // Verificar que el número de filas sea un entero válido
    try {
        int n = Integer.parseInt(expresion.substring(3));
        if (n <= 0) {
            System.out.println("El número de filas debe ser un entero positivo.");
            return false;
        }
    } catch (NumberFormatException e) {
        System.out.println("El número de filas debe ser un entero válido.");
        return false;
    }

    return true;
}

    public static void generarFila(char a, char b, int n, int filaActual) {
        if (filaActual >= n) {
            return;
        }

        int numCaracteres = filaActual + 1;
        if (filaActual % 2 == 0) {
            imprimirCaracteres(a, b, numCaracteres, 0);
        } else {
            imprimirCaracteres(b, a, numCaracteres, 0);
        }

        System.out.println();
        generarFila(a, b, n, filaActual + 1);
    }

    public static void imprimirCaracteres(char c1, char c2, int numCaracteres, int contador) {
        if (contador >= numCaracteres) {
            return;
        }

        System.out.print((contador % 2 == 0) ? c1 : c2);
        imprimirCaracteres(c1, c2, numCaracteres, contador + 1);
    }
}

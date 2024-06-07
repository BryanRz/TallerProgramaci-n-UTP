package PC2_RUIZALCAZAR;
/*
Apellidos y nombres: Ruiz Alcazar Bryan Clyder
CÓDIGO DE ESTUDIANTE: U23231771
 */
/*
Diseñar un programa, que almacene números aleatorios del 5 al 150, en un arreglo de dimensión 10 y mostrar los números del arreglo.
(utiliza Math.Random). Luego muestre el mayor valor del arreglo, la cantidad de números que son múltiplos de 13 y 
el promedio de los múltiplos que aparece en el arreglo.

Recuerda:
· Documentar la aplicación.
· Aplicar el método StringBuilder.append
*/
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear arreglo
        int[] numeros = new int[10];
        
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(146) + 5;
        }
        //Aquí se imprime los números del arreglo 
        System.out.println("Números del arreglo:");
        StringBuilder numerosStr = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            numerosStr.append(numeros[i]);
            if (i != numeros.length - 1) { //-1 para que no cree una coma demás
                numerosStr.append(", ");
            }
        }
        System.out.println(numerosStr);
        
        // Encontrar el mayor valor del arreglo
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El mayor valor del arreglo es: " + maximo);
        
        // Contar la cantidad de números que son múltiplos de 13
        int cantidadMultiplos13 = 0;
        for (int num : numeros) {
            if (num % 13 == 0) {
                cantidadMultiplos13++;
            }
        }
        System.out.println("La cantidad de números que son múltiplos de 13: " + cantidadMultiplos13);
        
        // Calcular el promedio de los múltiplos de 13 en el arreglo
        double sumaMultiplos13 = 0;
        int cantMultiplos13Encontrados = 0;
        for (int num : numeros) {
            if (num % 13 == 0) {
                sumaMultiplos13 += num;
                cantMultiplos13Encontrados++;
            }
        }
        double promedioMultiplos13 = cantMultiplos13Encontrados > 0 ? sumaMultiplos13 / cantMultiplos13Encontrados : 0; //Operador ternario
        System.out.println("El promedio de los múltiplos de 13 en el arreglo: " + promedioMultiplos13);
    }
}


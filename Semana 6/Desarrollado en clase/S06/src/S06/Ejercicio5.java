package S06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
Desarrollar un programa en Java que solicite al usuario
* el ingreso de un código universitario y valide su 
* formato. Mostrar el mensaje adecuado en caso no se 
* cumpla dicho formato y volver a solicitar el código,
* usando la estructura while, ejemplo: U23205077
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto="";
        
        System.out.println("Ingrese su código");
        texto=scan.nextLine();
        
        //patter
        Pattern cod=Pattern.compile("^[A-Z0-9]{9}$");
        Matcher evaluadorCod=cod.matcher(texto);
        
        //estructura condicional
        if (evaluadorCod.find()) {
            System.out.println("Código valido");
        }else{
            System.out.println("Código inválido");
        }
        
        
    }
}

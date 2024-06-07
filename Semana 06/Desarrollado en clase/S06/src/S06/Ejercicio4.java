package S06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

    public static void main(String[] args) {
        Pattern patronDNI = Pattern.compile("[0-9]{8}"); // ocho caracteres numéricos

        Matcher evaluadorDNI = patronDNI.matcher("16734501");
        boolean dniValido = evaluadorDNI.matches();
        System.out.println(dniValido); // true

        evaluadorDNI = patronDNI.matcher("976856");
        dniValido = evaluadorDNI.matches();
        System.out.println(dniValido);  // false

    }
}

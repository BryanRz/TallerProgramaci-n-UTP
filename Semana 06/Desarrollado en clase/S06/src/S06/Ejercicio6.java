/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean codigo = true;
        String texto = "";

        while (codigo) {
            System.out.println("Ingrese su código");
            texto = scan.nextLine();
            //patter
            Pattern cod = Pattern.compile("^[A-Z0-9]{9}$");
            Matcher evaluadorCod = cod.matcher(texto);

            //estructura condicional
            if (evaluadorCod.find()) {
                System.out.println("Código valido");
            } else {
                System.out.println("Código inválido");
            }
            //centinela
            codigo=(texto.length()!=9);
        }
    }
}
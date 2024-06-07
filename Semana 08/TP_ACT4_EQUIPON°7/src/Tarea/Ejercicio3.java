package Tarea;

import java.util.Scanner;

/*
Escribir un programa para recoger los votos de 10 personas que elegirán un color
para una campaña publicitaria. Los colores son: celeste, morado y turquesa.
Mostrar al final, cuántos votos obtuvo cada color, su porcentaje y qué color resultó elegido.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Variables
        int totv=10,c=0,m=0,t=0;
        String color;
        for (int i = 1; i <=totv; i++) {
            System.out.println("Persona "+i);
            System.out.println("¿Qué color escogió? (celeste, morado o turquesa)");
            color=scan.nextLine();
            if (color.equalsIgnoreCase("celeste")) {
                c++;
            }else if (color.equalsIgnoreCase("morado")) {
                m++;
            }else if (color.equalsIgnoreCase("turquesa")) {
                t++;
            }
        }
        System.out.println("Votos del celeste: "+c+". Porcentaje de votos: "+(c*10)+"%");
        System.out.println("Votos del morado: "+m+". Porcentaje de votos: "+(m*10)+"%");
        System.out.println("Votos del turquesa: "+t+". Porcentaje de votos: "+(t*10)+"%");
        if (c>m && c>t) {
            System.out.println("El ganador fue el celeste");
        }else if (m>c && m>t) {
            System.out.println("EL ganador fue el morado");
        }else{
            System.out.println("El ganador fue el turquesa");
        }                    
    }
}

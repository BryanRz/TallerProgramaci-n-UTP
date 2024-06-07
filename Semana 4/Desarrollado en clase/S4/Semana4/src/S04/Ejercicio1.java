
package S04;

public class Ejercicio1 {
    //crear clase principal
    public static void main(String[] args) {
        //Declaración de variables
        int estadoProyecto=3;
        String descripcion="";
        
        //estructura condicional múltiple switch
        descripcion = switch (estadoProyecto) {
            case 0 -> "Creado";
            case 1 -> "Asignado";
            case 2 -> "En proceso";
            case 3 -> "Finalizado";
            case 4 -> "Cancelado";
            case 5 -> "Suspendido";
            default -> "Error";
        };
        //salida
        System.out.println("El estado del proyecto es"
                +descripcion.toUpperCase());
        
    }
}

package PC2_RUIZALCAZAR;

import java.util.Scanner;

/*
Apellidos y nombres: Ruiz Alcazar Bryan Clyder
CÓDIGO DE ESTUDIANTE: U23231771
 */

/*
Un supermercado ha puesto en oferta la venta de licores, a precios dados en la siguiente tabla:
Licores                   Precio
Whisky                  S/. 250.50
Tequila                 S/. 170.50
Ron                     S/. 165.50

Como oferta especial la tienda aplica un porcentaje de descuento sobre el importe de la compra de acuerdo con la siguiente tabla:
Cantidad de licores	 Descuento
>=12                        25%
>= 8 y <12                  13%
>= 5 y < 8                  8%
< 5                         2%
Diseñe un programa que permita efectuar ventas y muestre luego de cada una de ellas la siguiente información:
. El importe de la compra
. El importe del descuento
. El importe a pagar
. La cantidad de licores vendidos de cada tipo entre todas las ventas
. El importe total acumulado de cada tipo de licor entre todas las ventas

Ingresado el valor válido, el programa continúa si el usuario responde Sí a “¿Desea continuar? (Sí/No)”. Si contesta No, el programa termina.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        //Asignar variables
        Scanner scan = new Scanner(System.in);
        double precioWhisky = 250.50, precioTequila = 170.50, precioRon = 165.50;
        int cantidadWhisky = 0, cantidadTequila = 0, cantidadRon = 0;
        double totalWhisky = 0, totalTequila = 0, totalRon = 0;
        char continuar;
        //Proceso
        do {
            System.out.println("Ingrese la cantidad de whisky vendido:");
            int ventasWhisky = scan.nextInt();
            cantidadWhisky += ventasWhisky;
            totalWhisky += ventasWhisky * precioWhisky;
            
            System.out.println("Ingrese la cantidad de tequila vendido:");
            int ventasTequila = scan.nextInt();
            cantidadTequila += ventasTequila;
            totalTequila += ventasTequila * precioTequila;
            
            System.out.println("Ingrese la cantidad de ron vendido:");
            int ventasRon = scan.nextInt();
            cantidadRon += ventasRon;
            totalRon += ventasRon * precioRon;
            
            int cantidadTotal = cantidadWhisky + cantidadTequila + cantidadRon;
            double importeCompra = totalWhisky + totalTequila + totalRon;
            double descuento = 0;
            
            if (cantidadTotal >= 12) {
                descuento = 0.25 * importeCompra;
            } else if (cantidadTotal >= 8 && cantidadTotal < 12) {
                descuento = 0.13 * importeCompra;
            } else if (cantidadTotal >= 5 && cantidadTotal < 8) {
                descuento = 0.08 * importeCompra;
            } else {
                descuento = 0.02 * importeCompra;
            }
            
            double importePagar = importeCompra - descuento;
            //Salida
            System.out.println("Importe de la compra: " + importeCompra);
            System.out.println("Importe del descuento: " + descuento);
            System.out.println("Importe a pagar: " + importePagar);
            System.out.println("Cantidad de whisky vendido: " + cantidadWhisky);
            System.out.println("Cantidad de tequila vendido: " + cantidadTequila);
            System.out.println("Cantidad de ron vendido: " + cantidadRon);
            System.out.println("Importe total acumulado de whisky: " + totalWhisky);
            System.out.println("Importe total acumulado de tequila: " + totalTequila);
            System.out.println("Importe total acumulado de ron: " + totalRon);
            
            System.out.println("¿Desea continuar? (Sí/No)");
            continuar = scan.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }
}

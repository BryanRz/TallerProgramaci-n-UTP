package S07Tarea;
import java.util.Scanner;
public class S07Tarea4 {
   public static void main(String[] args) {
       //variables
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int ND = scan.nextInt();
        
        String NB = bd(ND);
        
        System.out.println("El número binario equivalente es: " + NB);
        
        scan.close();
    }
    
    public static String bd(int dn) {
        StringBuilder bb = new StringBuilder();
        
        if (dn == 0) {
            bb.append(0);
        }
        
        while (dn > 0) {
            int remainder = dn % 2;
            bb.insert(0, remainder);
            dn /= 2;
        }
        
        return bb.toString();
    }
}

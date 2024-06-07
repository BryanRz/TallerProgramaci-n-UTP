
package S04;


public class Ejercicio5 {
    public enum DefinicionCalificacion{Excelente, MuyBien, Satisfactorio, Suficiente, Insatisfactorio};
    
    public static void main(String[] args) {
     DefinicionCalificacion resultado= DefinicionCalificacion.Insatisfactorio;
     Integer calificacion=89;
     
     resultado=switch(calificacion){
         case Integer c when (c>=90 && c<=100)->DefinicionCalificacion.Excelente;
         case Integer c when (c>=70 && c<=89)->DefinicionCalificacion.MuyBien;
         case Integer c when (c>=50 && c<=69)->DefinicionCalificacion.Satisfactorio;
         case Integer c when (c>=30 && c<=49)->DefinicionCalificacion.Suficiente;
         case Integer c when (c>=0 && c<=29)->DefinicionCalificacion.Insatisfactorio;
         default-> throw new IllegalArgumentException("Opcion inválida");
     };
        System.out.println();
    }

}

package eje04;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio04
{
    public static void main ( String argv[]) {
    // Incluir los tratamiento de excepciones adecuados.
    // Para que capturen todos posibles fallos
    	
      try {
       metodoQueFalla();   
      }
      catch ( NullPointerException ex) {
    	  System.out.println("Error NULL");
    	  ex.printStackTrace();
      }
      catch ( InputMismatchException ex) {
    	  System.out.println("Error entrada númerica");
    	  ex.printStackTrace();
      }
      catch (  ExceptionCero ex ) {
    	  System.out.println("Error cero");
    	  ex.printStackTrace();
      }
      catch ( IndexOutOfBoundsException ex ) {
    	  System.out.println("Error índice");
    	  ex.printStackTrace();
      }
      catch ( Exception ex) {
    	  System.out.println("Otra");
    	  ex.printStackTrace();
      }
      
     
      System.out.println("Fin del programa.");
    }
    
    /**
     * Este metodo puede generar muchas excepciones
     */
    static void metodoQueFalla(){
        
       Cosa tcosas [] = new Cosa [5];
       Scanner sc = new Scanner (System.in);
        
       System.out.println("Introduce un valor:");
       int num = sc.nextInt();
       
       tcosas[0] = new Cosa(num++);
       tcosas[2] = new Cosa(num++);
       tcosas[4] = new Cosa(num++);
       
       System.out.println("Introduce una posicion :");
       int pos = sc.nextInt();
       
       System.out.println("El valor en la posicion "+ pos +
                          " es " + tcosas[pos].getValor());
      
    }   
}

class Cosa {
    private int valor;
    
    Cosa (int valor) {
    	if (valor == 0) throw new ExceptionCero();
        this.valor = valor;
    }
    
    int getValor (){
        return valor;
    }
    
}

class ExceptionCero extends RuntimeException {
	
	ExceptionCero(){
		super("No me gusta el valor 0");
	}
}

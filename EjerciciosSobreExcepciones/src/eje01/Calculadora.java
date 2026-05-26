package eje01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora
{
    // instance variables - replace the example below with your own
    public static void main ( String argv[] ){
    
        int num1;
        int num2;
        int resu =0;
        char operador, continuar;
        boolean error = false;
        Scanner sc = new Scanner(System.in);
        
        do {
         error = false;
         System.out.print("1º Valor:");
         num1 = leerNúmero(sc);
         System.out.print("2º Valor:");
         num2 = leerNúmero(sc);
         System.out.print("Introduce el operador [+-*/]:");
         operador = leerOperador(sc);
         try {
          resu = operar(operador,num1,num2);
          }
          catch ( ArithmeticException ex ){
             error = true;
             System.err.println("Error: division por cero");
            }
          catch ( DesbordamientoException ex  ){
            error = true;
            System.err.println("Error: desbordamientos en resultado");
          }
          if ( !error ) System.out.println("Resultado = "+resu);
          System.out.print(" ¿Desea continuar? (S/N):");
          continuar = sc.next().charAt(0);
        } while ( continuar == 's' || continuar == 'S');
        
        System.out.println("- Fin del programa -");
    }

    static int leerNúmero ( Scanner sc){
      boolean error = false;
      int valor =0;
      do {
          error = false;
          try {  
            valor = sc.nextInt();
            if (Math.abs(valor) > 99999){
                throw new DesbordamientoException ();
            }
           }
          catch ( InputMismatchException ex){
              System.err.println("Formato erróneo");
              sc.next(); // leo el valor erroneo
              error = true;
              System.out.print("?");
            }
          catch ( DesbordamientoException ex){
              System.err.println("Error de desbordamiento");
              error = true;
              System.out.print("?");
            }
        }
      while ( error == true);   
      return valor;
    }
    
    static char leerOperador ( Scanner sc){
        char letra;
        
        letra = sc.next().charAt(0);
        while ( letra != '+' && letra != '-' && letra != '/' &&
                letra != '*'){
                    System.out.print("?");
                    letra = sc.next().charAt(0);
                }
        return letra;
    }
    
    static int operar (char letra, int num1, int num2)
       throws DesbordamientoException {
        
        int resu = 0;
        switch ( letra ) {
            case '+': resu = num1 + num2; break;
            case '-': resu = num1 - num2; break;
            case '*': resu = num1 * num2; break;
            case '/': resu = num1 / num2; break;
        }
        if ( Math.abs( resu ) > 99999 ) throw new DesbordamientoException();
        return resu;
    }
}

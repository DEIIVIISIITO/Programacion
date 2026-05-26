package eje02;

import java.util.Random;

public class Test666
{
    // instance variables - replace the example below with your own
    public static void main ( String arg[]){
        
    try {
     generarAleatorio();
    }
    catch ( DevilException e ){
        System.out.println(" Se ha producido la excepción :"+ e.getMessage());
    }
    System.out.println("Llego el fin del mundo.");
    
    }
    
    
    static void generarAleatorio() throws DevilException {
    
        Random  azar = new Random();
        int valor;
        int contador666 = 0;
        
        while ( true) {
            valor = azar.nextInt(10) + 1;
            if ( valor == 6){
                contador666++;
                if ( contador666 == 3){
                   throw new DevilException();
                }
             }
           else {
               contador666 = 0;
            }      
        }    
        
        
    }    
}

package eje04ArrayList;



/**
 *     4.  A partir igualmente de un ArrayList con 20 valores aleatorios entre (0, 100).
 *         Ordenar la lista, mostrar su contenido,  guardar  de la lista los valores
 *         no repetidos mediante una  colección auxiliar de tipo TreeSet 
 *         y muestra el contenido de esta. Comprobar que los valores no se repiten
 *         y que están ordenados
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Eje04_ArrayList
{
    public static void main(String[] args) {
        
    final int NELEMENTOS =  20;

    ArrayList<Integer> lista = new ArrayList<Integer>();
    
    for (int i = 0; i < NELEMENTOS; i++) {
      lista.add((int)(Math.random()*101));
    }
    // Lista original
    System.out.println("Lista generada: " + lista);
    
    // Ordeno la lista
    lista.sort( (x,y) -> (x - y));
    System.out.println("Lista ordenada: " + lista);
    
    // Creo un conjunto a partir de la lista (Elimina los repetidos)
    Set <Integer> listaSinRepes = new TreeSet <Integer>(lista);
    
    // Muestro el resultado 
    System.out.println("Lista sin repes:" + listaSinRepes);
    }    
    
}

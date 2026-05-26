package eje03;

public class NumerosPescaderia
{
    // instance variables - replace the example below with your own
    private int maximo;
    private int contador;

    /**
     * Constructor for objects of class NumerosPescaderia
     */
    public NumerosPescaderia(int maximo)
    {
        // initialise instance variables
        this.maximo = maximo;
        this.contador = 0;
    }

    public void cogerNumero() throws EstoySaturaoException{
        // Si estoy con el valor maximo lanzo al excepcion y
        // el contador no se incrementa.
        if (contador == maximo) throw new EstoySaturaoException(contador);
        contador++;
    }
    
    public void dejarNumero(){
       if ( contador > 0 ) contador--;   
    }
}


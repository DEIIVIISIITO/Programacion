package eje03;

public class EstoySaturaoException extends Exception {

	  public EstoySaturaoException(int num)
	    {
	        // initialise instance variables
	        super("Pescaderia petada. Hay "+num+ " clientes");
	    }
	    
	}

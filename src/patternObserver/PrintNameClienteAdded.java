package patternObserver;

public class PrintNameClienteAdded implements IClienteAddedListener{
	 

	    @Override
	    public void onClienteAdded (Cliente cliente) {
 	        System.out.println("Added a new cliente with name '" + cliente.getNome() + "'");
	    }
 }
 

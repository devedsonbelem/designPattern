package patternObserver;

import java.util.ArrayList;
import java.util.List;

public class Site {
 

	    private List<Cliente> clientes = new ArrayList<>();
	    private List<IClienteAddedListener> listeners = new ArrayList<>();

	    public void addCliente (Cliente cliente) {
	        this.clientes.add(cliente);
	        this.notifyClienteAddedListeners(cliente);
	    }

	    public void registerClienteAddedListener (IClienteAddedListener listener) {
	        this.listeners.add(listener);
	    }

	    public void unregisterClienteAddedListener (IClienteAddedListener listener) {
	        this.listeners.remove(listener);
	    }

	    protected void notifyClienteAddedListeners (Cliente cliente) {
	        this.listeners.forEach(listener -> listener.onClienteAdded(cliente));
	    }
	}
 

package patternObserver;

import java.util.UUID;

public class Main {
	public static void main(String[] args) {
        Site site = new Site();
        
        site.registerClienteAddedListener(new PrintNameClienteAdded());
        site.registerClienteAddedListener(new CountingClienteListener());

        
         site.addCliente(new Cliente(UUID.randomUUID().toString(), "jose"));
         site.addCliente(new Cliente(UUID.randomUUID().toString(), "belem"));
	}
}

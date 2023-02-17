package patternObserver;

public class CountingClienteListener implements IClienteAddedListener  {
	private static int clientesAddedCount = 0;

    @Override
    public void onClienteAdded (Cliente cliente) {
        clientesAddedCount++;
        System.out.println("Total cliente added: " + clientesAddedCount);
    }
}
 

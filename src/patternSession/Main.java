package patternSession;

public class Main {
	public static void main(String[] args) {
		try {
	    Server server = new Server("localhost", 8080);
	    Session session1 = server.getSession("Session1");
	    Request request1 = new Request("Data1", session1);
	    server.process(request1);
	   
	         Thread.sleep(1000);
	    
	    Session session2 = server.getSession("Session2");
	    Request request2 = new Request("Data2", session2);
	    server.process(request2);
		}catch(Exception ex) {
			System.out.println("Erro no Sessao");
		}
	  }
}

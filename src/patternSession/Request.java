package patternSession;

public class Request {
	  
	  private Object dados;
	  private Session session;
	  
	  public Request(Object dados, Session session) {
		 this.dados= dados;
		 this.session = session;
	}
	  

	@Override
	public String toString() {
		return "Request [Dados=" + dados + ", Session=" + session + "]";
	}

	public Object getDados() {
		return dados;
	}


	public void setDados(Object dados) {
		this.dados = dados;
	}


	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	  
	  
}

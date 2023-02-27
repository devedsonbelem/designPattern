package patternSession;

import java.time.LocalDateTime;

public class Server {

	 private String host;
	 private Integer port;
	 
	 public Server() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 public Server(String host, Integer port) {
		super();
		this.host = host;
		this.port = port;
 
	}

	 

	@Override
	public String toString() {
		return "Server [host=" + host + ", port=" + port + "]";
	}


	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	 
	public Integer getPort() {
		return port;
	}


	public void setPort(Integer port) {
		this.port = port;
	}


	public Session getSession(String name) {
	  Session session = new Session(name);
	   session.setDataHora(LocalDateTime.now());
		return session;
	}


 
    public Server process(Request request) {
    	System.out.println(request.toString());
    	return this;
    }
	 
	
	
	 
	 
	 
}

package patternObserver;

public class Cliente {

	
	 private String uuid;
	 private String nome;
	 
	 public Cliente() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	public Cliente(String uuid, String nome) {
		super();
		this.uuid = uuid;
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Cliente [uuid=" + uuid + ", nome=" + nome + "]";
	}


	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	 
}

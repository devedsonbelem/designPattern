package functionalJava8;

import java.util.function.Consumer;

public class ConsumerUsers implements Consumer<ConsumerUsers>{
	private Integer id;
	private String nome;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	 


	@Override
	public void accept(ConsumerUsers t) {
	  if (t.getId()!=null) {
		  System.out.println(t.getId());
	  }
		
	}
	

}

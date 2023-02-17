package functionalJava8;

import java.util.function.Predicate;

public class PredicateUsers implements Predicate<PredicateUsers>{

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
	public boolean test(PredicateUsers users) {
		 if (this.getNome().equals("belem")) {
		return true;
		 }else {
			 return false;
		 }
	}

}

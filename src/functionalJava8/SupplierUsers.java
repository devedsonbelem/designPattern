package functionalJava8;

import java.util.function.Supplier;

public class SupplierUsers  implements Supplier<Boolean>{
	
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
	public Boolean get() {
		if (this.nome.length()>3)
		return true;
	return false;
  }
	
	public static void main(String[] args) {
		
		SupplierUsers users = new SupplierUsers();
		 users.setId(1);
		 users.setNome("jose");
		 
		  System.out.println(users.get());
		  
	}

}

package abstractfactory;

 
import java.util.regex.Pattern;

public class DeveloperFactory  implements  UsuarioAbstractFactory {
  
	private String nome;
	private String email;
	private Integer active;
	
	@Override
	public IUsuario validateUsuario() {
		return new Developer(this.nome, this.active, this.email).
				isValidateNome().isValidateEmail().isValidateActive();
	}

	public DeveloperFactory(String nome, Integer active, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.active = active;
	}

	
	 
 
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Integer getActive() {
		return active;
	}

	public static void main(String[] args) {
		
		DeveloperFactory u = new DeveloperFactory("edson",1,"profedsonbelem@gmail.com" );
		
		 System.out.println(u.validateUsuario());
		System.out.println(u.getNome());
		System.out.println(u.getActive());
}		
 }
	
	
 

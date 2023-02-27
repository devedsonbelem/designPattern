package abstractfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Developer  implements IUsuario{
  
 
	private String name;
	private Integer active;
	private String email;
	

	public Developer(String name, Integer active, String email) {
		super();
		this.name = name;
		this.active = active;
		this.email = email;
 
	}
	
	

	@Override
	public String toString() {
		return "Developer [name=" + name + ", active=" + active + ", email=" + email + "]";
	}



	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getActive() {
		return active;
	}

	@Override
	public String getEmail() {
		return email;
	}
	public Developer  isValidateNome() {
		Pattern p = Pattern.compile("[a-zA-Z ]{2,50}");
		Matcher m = p.matcher(this.name);
		 if (m.matches()) {
			 return this;
		 }else {
			  throw new IllegalArgumentException("Nome invalido");
		 }
	}
	
	public Developer isValidateEmail() {
		Pattern p = Pattern.compile("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[a-z]{2,})?");
		Matcher m = p.matcher(this.email);
		 if (m.matches()) {
			 return this;
		 }else {
			 throw new IllegalArgumentException("Email invalido"); 
		 }
	}
	
	public Developer  isValidateActive() {
	if (this.active.equals(1)) {
		 return this;
	}else {
		 throw new IllegalArgumentException("ID invalido"); 
	}
	}
 

}

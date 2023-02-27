package abstractfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminFactory  implements  UsuarioAbstractFactory{
	  
		private String nome;
		private String email;
		private Integer active;
		
		@Override
		public IUsuario validateUsuario() {
			return new Admin(this.nome, this.active, this.email).isValidateActive().isValidateEmail().isValidateNome();
		}

		public AdminFactory(String nome, String email, Integer active) {
			this.nome = nome;
			this.email = email;
			this.active = active;
		}

		public AdminFactory  isValidateNome() {
			Pattern p = Pattern.compile("[a-zA-Z ]{2,50}");
			Matcher m = p.matcher(this.nome);
			if( m.matches()) {
				return this;
			}else {
				 throw new IllegalArgumentException("Nome invalido");
			}
		}
		

		public AdminFactory isValidateEmail() {
			Pattern p = Pattern.compile("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[a-z]{2,})?");
			Matcher m = p.matcher(this.email);
			 if (m.matches()) {
				 return this;
			 }else {
				 throw new IllegalArgumentException("Email invalido"); 
			 }
		}
		
		public AdminFactory isValidateActive() {
		if (this.active.equals(1)) {
			 return this;
		}else {
			 throw new IllegalArgumentException("ID invalido"); 
		}
		 
   }
		
 
}

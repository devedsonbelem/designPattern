package patterngateway;

public class Cliente {
 
	      private String codigo;
		  private String name;
		  private String email;
		  private String phone;

		  public Cliente (String codigo,String name, String email, String phone) {
		     this.codigo = codigo;
			this.name = name;
		    this.email = email;
		    this.phone = phone;
		  }
		  
	 public Cliente() {
		// TODO Auto-generated constructor stub
	}

 



		@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

       
 
		  
		 
}

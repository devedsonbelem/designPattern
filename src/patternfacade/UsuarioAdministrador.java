package patternfacade;

 
 public class UsuarioAdministrador  implements InterfaceUsuarioGenerico  {
	    private String codigo;
	    private String nome;
	    private String email;
	    private String senha;

	    public int login(String email, String senha) {
	        if (this.email.equals(email) && this.senha.equals(senha)) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }

	    public int cadastrar(String codigo, String nome, String email, String senha) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.email = email;
	        this.senha = senha;
	        return 1;
	    }

	    public UsuarioAdministrador() {
		 
		}
	    
	    
		@Override
		public String toString() {
			return "UsuarioAdministrador [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", senha=" + senha
					+ "]";
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	    
	    
	}
 
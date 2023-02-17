package patterngateway;

public class Users {
	private String codigo;
	private String nome;
	private String email;
	private String password;

	public Users(String codigo, String nome, String email, String password) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public Users() {

	}

	@Override
	public String toString() {
		return "Users [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", password=" + password + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

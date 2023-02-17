package patternproxy;

public class Users {
	private Integer codigo;
	private String nome;
	private String email;
	private String senha;
	private Integer ativo;

	public Users() {
	}

	public Users(Integer codigo, String nome, String email, String senha, Integer ativo) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
	}

	public Users(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public Users(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + email + ";" + senha + ";" + ativo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

}

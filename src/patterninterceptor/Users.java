package patterninterceptor;
import java.util.HashMap;
import java.util.Map;

public class Users {
    private int id;
    private String nome;
    private String email;
    private String password;
    private String token;

    public Users(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    
    
    @Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", email=" + email + ", password=" + password + ", token=" + token
				+ "]";
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
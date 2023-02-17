	package patternSolidip;

	//ORiginal Aplicando SSR e DIP
public class Users {
	    private String name;
	    private String email;
	    private String password;

	    public Users(String name, String email, String password) {
	        this.name = name;
	        this.email = email;
	        this.password = password;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getEmail() {
	        return this.email;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getPassword() {
	        return this.password;
	    }

	    public void register() {
	        // Adiciona usuário ao banco de dados
	    }

	    public void login() {
	        // Autentica usuário
	    }
	}

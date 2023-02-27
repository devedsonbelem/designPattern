package abstractfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Admin implements IUsuario {

	private String name;
	private Integer active;
	private String email;

	public Admin(String name, Integer active, String email) {
		super();
		this.name = name;
		this.active = active;
		this.email = email;

	}

	@Override
	public String getEmail() {

		return email;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public Integer getActive() {

		return active;
	}

	public Admin isValidateNome() {
		Pattern p = Pattern.compile("[a-zA-Z ]{2,50}");
		Matcher m = p.matcher(this.name);
		if (m.matches()) {
			return this;
		} else {
			throw new IllegalArgumentException("Nome invalido");
		}
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", active=" + active + ", email=" + email + "]";
	}

	public Admin isValidateEmail() {
		Pattern p = Pattern.compile("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[a-z]{2,})?");
		Matcher m = p.matcher(this.email);
		if (m.matches()) {
			return this;
		} else {
			throw new IllegalArgumentException("Email invalido");
		}
	}

	public Admin isValidateActive() {
		if (this.active.equals(1)) {
			return this;
		} else {
			throw new IllegalArgumentException("ID invalido");
		}
	}
}
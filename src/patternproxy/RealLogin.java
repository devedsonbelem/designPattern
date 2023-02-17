package patternproxy;

import java.util.Optional;

public class RealLogin implements ExecutaLogin {

	private Users users;

	@Override
	public Users login(String email, String senha) {
		Users users = new Users(email, senha);
		Optional<Users> result = ProxyLogin.read.searchFindByEmailAndFindBySenha(users);
		if (result.isPresent()) {
			System.out.println("Usuario Logado");
			return result.get();
		} else {
			throw new IllegalArgumentException(" Login Inexistente ...");
		}
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}

package patternproxy;

import java.util.ArrayList;
import java.util.List;

import arquivosequencial.MyFileReader;

public class ProxyLogin implements ExecutaLogin {
	
	private Users users;
	public static List<Users> listaUsersTxt = new ArrayList<Users>();
	public static MyFileReader read;
	private Boolean isAtivo;

	public void init() {
		try {
			read = new MyFileReader();
			read.openFileReader();
			listaUsersTxt = read.fileReaderTxt();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public ProxyLogin(Users users) {
		this.users = users;
		init();
	}

	@Override
	public Users login(String email, String senha) {
		this.verificarUsuarioAtivo(email);
		RealLogin realLogin = new RealLogin();
		return realLogin.login(email, senha);
	}

	private void verificarUsuarioAtivo(String email) {
		this.users = new Users(email);
		this.isAtivo = read.searchUsersActive(users);

	}

	public static void main(String[] args) {
		Users users = new Users("profedsonbelem@gmail.com", "senha@1");
		ProxyLogin proxy = new ProxyLogin(users);
		proxy.verificarUsuarioAtivo(users.getEmail());
		System.out.println(proxy.isAtivo);
		Users resp = proxy.login(users.getEmail(), users.getSenha());
		System.out.println(resp);
	}
}

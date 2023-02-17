package patternfacade;

public class Sistema {

	private UsuarioTeste usuarioTeste;
	private UsuarioProgramador usuarioProgramador;
	private UsuarioAdministrador usuarioAdministrador;

	public Sistema() {
		usuarioTeste = new UsuarioTeste();
		usuarioProgramador = new UsuarioProgramador();
		usuarioAdministrador = new UsuarioAdministrador();
	}

	public int login(String email, String senha, String tipoUsuario) {
	    	if (tipoUsuario.equals("usuarioTeste")){
	              return  usuarioTeste.login(email, senha);
	        }else if (tipoUsuario.equals("usuarioProgramador")) {
	    	     return usuarioProgramador.login(email, senha);
	        } else if (tipoUsuario.equals("usuarioAdministrador")) {
	        	 return usuarioAdministrador.login(email, senha);
	    }else {
	    	  System.out.println("Dados Invalidos ");
	    	  return 0;
	    }
	}

	public int cadastrar(String codigo, String nome, String email, String senha, String tipoUsuario) {
		if (tipoUsuario.equals("usuario")) {
			return usuarioTeste.cadastrar(codigo, nome, email, senha);
		} else if (tipoUsuario.equals("programador")) {
			return usuarioProgramador.cadastrar(codigo, nome, email, senha);
		} else if (tipoUsuario.equals("administrador")) {
			return usuarioAdministrador.cadastrar(codigo, nome, email, senha);
		} else {
			System.out.println("Tipo de usuário inválido.");
			return 0;
		}
	}
}

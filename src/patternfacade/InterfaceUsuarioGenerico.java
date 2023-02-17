package patternfacade;

public interface InterfaceUsuarioGenerico {
	    int login(String email, String senha);
	    int cadastrar(String codigo, String nome, String email, String senha);
}

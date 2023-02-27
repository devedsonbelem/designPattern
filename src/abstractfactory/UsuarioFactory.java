package abstractfactory;

public class UsuarioFactory {

	
	public static IUsuario validateUsuario(UsuarioAbstractFactory usuarioFactory) {
		return usuarioFactory.validateUsuario();
	}
}

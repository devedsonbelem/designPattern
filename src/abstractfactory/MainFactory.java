package abstractfactory;

public class MainFactory {

	
	 public static void main(String[] args) {
		DeveloperFactory dev = new DeveloperFactory("jose",1,"jose@gmail.com" );
		 
		 System.out.println(dev.validateUsuario());
		 
		 
	}
}

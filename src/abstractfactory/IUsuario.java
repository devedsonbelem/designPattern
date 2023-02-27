package abstractfactory;

 

public interface IUsuario {
 
        public String getEmail();
		public String getName();
		public Integer getActive();
	
		
		public IUsuario isValidateNome(); 
		public IUsuario isValidateEmail();
		public IUsuario isValidateActive(); 

}

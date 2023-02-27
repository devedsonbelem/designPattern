package stranglerpattern;

public class Gateway {

	 private final ManagedUsers managed ;

	public Gateway(ManagedUsers managed) {
		this.managed = managed;
		
	}

	public boolean validateUser(Users user) {
	 try {	
		
		this.managed.findByEmailByPassword(user.getEmail(),user.getPassword());
        return true;  
		
	  }catch(Exception ex) {
		 throw new IllegalArgumentException("Error: "+ ex.getMessage());
	  }
  }
	
	
	public static void main(String[] args) {
		try {
       
			 ManagedUsers managed = new ManagedUsers();
		     Gateway gateway = new Gateway(managed);
		 
		       Users u = new Users("adilio","adilio@gmail.com","123456");
		  
		   if(gateway.validateUser(u)) {
			   System.out.println("Valido Usuario:" + u);
		   }
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}


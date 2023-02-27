package stranglerpattern;

import java.util.UUID;
import java.util.function.Supplier;

public class Users implements Supplier<Users>{
 
	    private String id;
	    private String name;
	    private String email;
	    private String password;
 
	    {
	    	this.id = UUID.randomUUID().toString();
	    }
	 public Users() {
	
	 }
	 
	 
	    public Users(String name, String email, String password ) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
 
	}


		@Override
		public String toString() {
			return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password   
				  + "]";
		}


		public boolean equals(Object value) {
			if (value==null) {
				return false;
			}
			Users users =(Users) value;
			 return this.getEmail().equals(users.getEmail());
			
		}
		
		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}

 
	    public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		public Users validate() {
	        if(!this.getPassword().equals(null) || !this.getEmail().equals(null) || !this.getName().equals(null)) { 
	    	    System.out.println("ok");
                return this;
	        }else {
	    	 throw new IllegalArgumentException("Nao pode ter valores nulos em nenhum dos atributos");
	       }
		}


		@Override
		public Users get() {
			return this;
		}


		 


	 
		 


	 
 

	 
	  
 }

	
	
 

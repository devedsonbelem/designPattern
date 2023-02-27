package patternbridges;

public class AbstractionUsers {

	 protected Users users;
 
  	 public void setUsers(Users users) {
		this.users = users;
	 }
	 
	 public  void operation() {
		 this.users.operation();	
     }	
	 
}

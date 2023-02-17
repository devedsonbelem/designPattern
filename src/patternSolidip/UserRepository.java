package patternSolidip;

public interface UserRepository {

	   public void register(User user);
	   
	   public User findByEmail(String email);
	    
}

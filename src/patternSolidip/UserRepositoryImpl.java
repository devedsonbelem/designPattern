package patternSolidip;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
 
	    private List<User> users = new ArrayList<>();

	    @Override
	    public void register(User user) {
	      
	        users.add(user);
	    }

	    @Override
	    public User findByEmail(String email) {
	       
	        for (User user : users) {
	            if (user.getEmail().equals(email)) {
	                return user;
	            }
	        }
	        return null;
	    }
}


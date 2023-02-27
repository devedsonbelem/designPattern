package cqrs;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UsersRepository {
 
	    public  static Map<String, Users> store = new HashMap<String,Users>();
   
	    public Users save(Users users) {
	    	 users.setId(UUID.randomUUID().toString());
	    	 store.put(users.getId(), users);
	    	return store.get(users.getId());
	    }
	     
	    
	    public Users update(String id, Users users) {
	    	  Users respUsers =   store.get(users.getId());
              if (respUsers==null) { 
            	  throw new IllegalArgumentException("Nao Users Encontrado para Alterar");
              }
	    	  respUsers.setName(users.getName());
	    	  respUsers.setEmail(users.getEmail());
	    	  respUsers.setPassword(users.getPassword());
	    	return store.get(users.getId());
	    }
	    
	    
	    public String delete(String id) {
	    	  Users respUsers =   store.get(id);
            if (respUsers==null) { 
          	  throw new IllegalArgumentException("Nao Encontrado o Id para delete");
            }
             store.remove(id);
	    	 return "Dados Excluidos";
	    }
	    
	    
}

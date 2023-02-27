package cqrs;

import java.util.Map;
import java.util.Set;

import patterngateway.Address;

public class UserProjection {
     
	 private Map<String, Users> respMapa = UsersRepository.store;
	
	    public UserProjection() {
	        
	    }

	    public  Users  findById(Users users) {
	        Users userContact = respMapa.get(users.getId());
	        return userContact;
	    }

	    public Set<Address> handle(AddressByRegionQuery query) {
	        UserAddress userAddress = readRepository.getUserAddress(query.getUserId());
	        return userAddress.getAddressByRegion()
	          .get(query.getState());
	    }
	}
 

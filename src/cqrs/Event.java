package cqrs;

import java.util.Date;
import java.util.UUID;

public class Event {
	 
	    public final UUID id = UUID.randomUUID();
	    public final Date created = new Date();
	    public String state;
	    
	    public Event(String state) {
	    	this.state = state;
	    	
	    }
	    
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public UUID getId() {
			return id;
		}
		public Date getCreated() {
			return created;
		}
	    
	    
 
}

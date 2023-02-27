package agregatorevents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventEmmiter {

 private final Map<Event, List<EventObserver>> observerLists;

public EventEmitter() {
  observerLists = new HashMap<>();
}

public final void registerObserver(EventObserver obs, Event e) {
 
}

protected void notifyObservers(Event e) {
 
}
}
package event;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class EventCluster extends Observable {
  private static List<Event> events = new ArrayList<Event>();

  public EventCluster() {
    super();
  }

  public void publish(Event event) {
    events.add(event);
    setChanged();
    notifyObservers(event);
  }
}

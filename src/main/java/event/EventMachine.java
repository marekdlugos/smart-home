package event;

import entity.Entity;

public class EventMachine {
  private static EventCluster eventCluster = new EventCluster();

  public static void publish(Event event) {
    eventCluster.publish(event);
  }

  public static EventCluster getEventCluster() {
    return eventCluster;
  }

  public static void addSubscriber(Entity entity) {
    eventCluster.addObserver(entity);
  }
}

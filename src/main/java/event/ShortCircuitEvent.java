package event;

import entity.Entity;

public class ShortCircuitEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

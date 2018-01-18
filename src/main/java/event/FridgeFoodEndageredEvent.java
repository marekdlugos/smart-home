package event;

import entity.Entity;

public class FridgeFoodEndageredEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

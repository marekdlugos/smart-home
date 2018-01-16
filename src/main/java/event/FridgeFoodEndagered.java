package event;

import entity.Entity;

public class FridgeFoodEndagered extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

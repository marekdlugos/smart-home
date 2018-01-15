package event;

import entity.Entity;

public class FoodReadyEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

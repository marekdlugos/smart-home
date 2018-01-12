package event;

import entity.Entity;

public class ThisEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

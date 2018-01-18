package event;

import entity.Entity;

public class ExpiredWarrantyEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

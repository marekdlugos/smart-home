package event;

import entity.Entity;

/**
 * Represents the event when device's warranty has expired.
 */
public class ExpiredWarrantyEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

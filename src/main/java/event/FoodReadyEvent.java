package event;

import entity.Entity;
import entity.Person;

/**
 * Represents the event when the food is ready.
 */
public class FoodReadyEvent extends Event {
  private Person user;
  private String contents;

  public FoodReadyEvent(Person user, String contents) {
    this.user = user;
    this.contents = contents;
  }

  public Person getUser() {
    return user;
  }

  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

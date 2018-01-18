package event;

import entity.Entity;
import entity.Person;

public class FoodReadyEvent extends Event {
  private Person user;

  public FoodReadyEvent(Person user) {
    this.user = user;
  }

  public Person getUser() {
    return user;
  }

  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

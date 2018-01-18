package event;

import entity.Entity;
import entity.Person;

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

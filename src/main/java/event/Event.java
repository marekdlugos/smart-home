package event;

import entity.Entity;

public abstract class Event {
  public abstract void dispatchToHandler(Entity handler);
}

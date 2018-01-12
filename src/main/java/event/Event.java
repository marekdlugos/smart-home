package event;

import entity.Entity;

public abstract class Event {
  Entity source;
  Entity handler;

  public abstract void dispatchToHandler(Entity handler);

  public void setSource(Entity source) {
    this.source = source;
  }

  public void setHandler(Entity handler) {
    this.handler = handler;
  }
}

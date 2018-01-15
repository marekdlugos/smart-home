package event;

import entity.Entity;
import java.util.Date;


public abstract class Event {
  Entity source;
  Entity handler;
  Date createdAt = new Date();

  public abstract void dispatchToHandler(Entity handler);

  public void setSource(Entity source) {
    this.source = source;
  }

  public void setHandler(Entity handler) {
    this.handler = handler;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Entity getSource() {
    return source;
  }

  public Entity getHandler() {
    return handler;
  }
}

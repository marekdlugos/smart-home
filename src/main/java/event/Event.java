package event;

import entity.Entity;
import java.util.Date;

public class Event {
  Entity source;
  Entity handler;
  Date createdAt = new Date();

//  public abstract void dispatchToHandler(Entity handler);

  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }

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

  public boolean isHandled() {
    return handler != null;
  }
}

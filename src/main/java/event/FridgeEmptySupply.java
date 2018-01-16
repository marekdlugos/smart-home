package event;

import entity.Entity;

public class FridgeEmptySupply extends Event {
  private String contents;

  public FridgeEmptySupply(String contents) {
    this.contents = contents;
  }

  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

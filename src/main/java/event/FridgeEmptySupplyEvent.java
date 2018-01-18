package event;

import device.Fridge;
import entity.Entity;

public class FridgeEmptySupplyEvent extends Event {
  private Fridge fridge;
  private String contents;
  private Integer shortAmount;

  public FridgeEmptySupplyEvent(Fridge fridge, String contents, Integer shortAmount) {
    this.fridge = fridge;
    this.contents = contents;
    this.shortAmount = shortAmount;
  }

  public Fridge getFridge() {
    return fridge;
  }

  public String getContents() {
    return contents;
  }

  public Integer getShortAmount() {
    return shortAmount;
  }

  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}

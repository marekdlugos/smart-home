package entity;

import event.FridgeEmptySupplyEvent;

public class Mother extends Person {
  public Mother() {
    super();
  }

  public void handle(FridgeEmptySupplyEvent event) {
    event.setHandler(this);

    Integer amountToSupply = event.getShortAmount() == 0 ? 10 : event.getShortAmount();

    event.getFridge().place(event.getContents(), amountToSupply);
  }
}

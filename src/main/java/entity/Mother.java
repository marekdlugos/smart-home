package entity;

import event.FridgeEmptySupplyEvent;

/**
 * Represents a mother in the family.
 */
public class Mother extends Person {
  public Mother() {
    super();
  }

  /**
   * Handles the event when the fridge is empty.
   * @param event An event when the fridge is empty.
   */
  public void handle(FridgeEmptySupplyEvent event) {
    event.setHandler(this);

    Integer amountToSupply = event.getShortAmount() == 0 ? 10 : event.getShortAmount();

    event.getFridge().place(event.getContents(), amountToSupply);
  }
}

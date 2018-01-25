package device.fridge;

import device.Fridge;
import event.FridgeEmptySupplyEvent;

public class ActiveState extends FridgeState {
  public double getConsumptionRate() {
    return 100.0;
  }


  /**
   * Returns boolean if Standby Button has been pressed or not
   *
   * @param  fridge  the fridge device itself
   * @return         the boolean value
   */
  public boolean pressStandbyButton(Fridge fridge) {
    fridge.setState(new TurnedOffState());

    return true;
  }

  /**
   * Returns boolean
   *
   * @param  fridge  the fridge device itself
   * @param  contents  contents
   * @param  amount  amount
   * @return         the boolean value
   */
  public boolean place(Fridge fridge, String contents, Integer amount) {
    Integer fridgeAmount = fridge.getContents().containsKey(contents) ? fridge.getContents().get(contents) : 0;

    fridge.getContents().put(contents, fridgeAmount + amount);

    return true;
  }

  /**
   * Returns boolean
   *
   * @param  fridge  the fridge device itself
   * @param  contents  contents
   * @return         the boolean value
   */
  public boolean withdraw(Fridge fridge, String contents) {
    return withdraw(fridge, contents, 1);
  }

  /**
   * Returns boolean
   *
   * @param  fridge  the fridge device itself
   * @param  contents  contents
   * @param  amount  amount
   * @return         the boolean value
   */
  public boolean withdraw(Fridge fridge, String contents, Integer amount) {
    Integer fridgeAmount = fridge.getContents().containsKey(contents) ? fridge.getContents().get(contents) : 0;

    if (fridgeAmount - amount <= 0) {
      fridge.emit(new FridgeEmptySupplyEvent(fridge, contents, amount));
      fridge.getContents().put(contents, 0);
      return false;
    }

    fridge.getContents().put(contents, fridgeAmount - amount);

    return false;
  }
}

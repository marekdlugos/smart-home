package device.fridge;

import device.Fridge;
import event.FoodReadyEvent;
import event.FridgeEmptySupply;
import event.FridgeFoodEndagered;

public class TurnedOffState extends FridgeState {
  public double getConsumptionRate() {
    return 100.0;
  }

  public boolean pressStandbyButton(Fridge fridge) {
    fridge.setState(new ActiveState());
    return true;
  }

  public boolean place(Fridge fridge, String contents, Integer amount) {
    Integer fridgeAmount = fridge.getContents().containsKey(contents) ? fridge.getContents().get(contents) : 0;

    fridge.getContents().put(contents, fridgeAmount + amount);

    fridge.emit(new FridgeFoodEndagered());

    return true;
  }

  public boolean withdraw(Fridge fridge, String contents) {
    return withdraw(fridge, contents, 1);
  }

  public boolean withdraw(Fridge fridge, String contents, Integer amount) {
    Integer fridgeAmount = fridge.getContents().containsKey(contents) ? fridge.getContents().get(contents) : 0;

    if (fridgeAmount - amount <= 0) {
      fridge.emit(new FridgeEmptySupply(contents));
      fridge.getContents().put(contents, 0);
      return false;
    }

    fridge.getContents().put(contents, fridgeAmount - amount);

    return false;
  }
}

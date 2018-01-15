package device.fridge;

import device.Fridge;

public class TurnedOffState extends FridgeState {
  public double getConsumptionRate() {
    return 100.0;
  }

  public boolean pressStandbyButton(Fridge fridge) {
    fridge.setState(new ActiveState());
    return true;
  }

  public boolean place(Fridge fridge, String contents, Integer amount) {
    return false;
  }

  public boolean withdraw(Fridge fridge, String contents) {
    return false;
  }

  public boolean withdraw(Fridge fridge, String contents, Integer amount) {
    return false;
  }
}

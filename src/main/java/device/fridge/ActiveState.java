package device.fridge;

import device.Fridge;

public class ActiveState extends FridgeState {
  public double getConsumptionRate() {
    return 100.0;
  }

  public boolean pressStandbyButton(Fridge fridge) {
    fridge.setState(new TurnedOffState());

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

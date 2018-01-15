package device.fridge;

import device.DeviceState;
import device.Fridge;

public abstract class FridgeState implements DeviceState {
  public abstract boolean pressStandbyButton(Fridge fridge);
  public abstract boolean place(Fridge fridge, String contents, Integer amount);
  public abstract boolean withdraw(Fridge fridge, String contents);
  public abstract boolean withdraw(Fridge fridge, String contents, Integer amount);
}

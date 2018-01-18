package device;

import device.fridge.ActiveState;
import device.fridge.FridgeState;
import device.fridge.TurnedOffState;

import java.util.Map;
import java.util.HashMap;

public class Fridge extends Device {
  Map<String, Integer> contents;

  public Fridge() {
    super();
    this.contents = new HashMap<String, Integer>();
    this.state = new TurnedOffState();
  }

  public boolean withdraw(String item, Integer amount) {
    return getState().withdraw(this, item, amount);
  }

  public boolean withdraw(String item) {
    return getState().withdraw(this, item, 1);
  }

  public boolean place(String item, Integer amount) {
    return getState().withdraw(this, item, amount);
  }

  public boolean turnOn() {
    return getState().pressStandbyButton(this);
  }

  public boolean turnOff() {
    return getState().pressStandbyButton(this);
  }

  public Map<String, Integer> getContents() {
    return contents;
  }

  public boolean isSwitchedOn() {
    return getState() instanceof ActiveState;
  }

  public FridgeState getState() {
    return (FridgeState) state;
  }
}
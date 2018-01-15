package device;

import device.fridge.FridgeState;
import device.fridge.TurnedOffState;

import java.util.Map;
import java.util.HashMap;

public class Fridge extends Device {
  Map<String, Integer> contents;
  FridgeState state;

  public Fridge() {
    super();
    this.contents = new HashMap<String, Integer>();
    this.state = new TurnedOffState();
  }

  public void setState(FridgeState state) {
//    this.energyConsumed += calculateConsumption(stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

//    touchStateChangedAt();

    this.state = state;
  }

  public boolean withdraw(String item, Integer amount) {
    return false;
  }

  public boolean withdraw(String item) {
    return false;
  }

  public boolean place(String item, String amount) {
    return false;
  }

  public boolean turnOn() {
    return this.state.pressStandbyButton(this);
  }

  public boolean turnOff() {
    return this.state.pressStandbyButton(this);
  }

  public Map<String, Integer> getContents() {
    return contents;
  }
}
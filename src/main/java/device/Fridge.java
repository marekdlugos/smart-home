package device;

import device.fridge.ActiveState;
import device.fridge.FridgeState;
import device.fridge.TurnedOffState;

import java.util.Map;
import java.util.HashMap;

public class Fridge extends Device {
  Map<String, Integer> contents;
  FridgeState state;
  private Long stateLastChangedAt;
  private Double energyConsumed;

  public Fridge() {
    super();
    this.contents = new HashMap<String, Integer>();
    this.state = new TurnedOffState();
  }

  public void setState(FridgeState state) {
    this.energyConsumed += calculateConsumption(stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

    touchStateChangedAt();

    this.state = state;
  }

  public double calculateConsumption(Long from, Long to, Double consumptionPerHour) {
    Long period = to - from;
    Double totalConsumption = period * consumptionPerHour;
    return (this.energyConsumed =+ totalConsumption);
  }

  public boolean withdraw(String item, Integer amount) {
    return this.state.withdraw(this, item, amount);
  }

  public boolean withdraw(String item) {
    return this.state.withdraw(this, item, 1);
  }

  public boolean place(String item, Integer amount) {
    return this.state.withdraw(this, item, amount);
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

  public boolean isSwitchedOn() {
    return this.state instanceof ActiveState;
  }
}
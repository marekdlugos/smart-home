package device;

import device.fridge.FridgeState;

import java.util.Map;
import java.util.HashMap;

public class Fridge extends Device {
  Map<String, Integer> contents;
  FridgeState state;

  public Fridge() {
    this.contents = new HashMap<String, Integer>();
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
}
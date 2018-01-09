package device;

import java.util.Map;
import java.util.HashMap;

public class Fridge extends Device {
  Map<String, Integer> contents;

  public Fridge() {
    this.contents = new HashMap<String, Integer>();
  }

  public boolean withdraw(String item, Integer amount) {
    return false;
  }

  public boolean put(String item, String amount) {
    return false;
  }
}

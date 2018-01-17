package device;

import event.ShortCircuitEvent;

public class ShortCircuitSensor extends Sensor {
  public void handle(ShortCircuitEvent event) {
    System.out.println("Handling skrat");
  }
}

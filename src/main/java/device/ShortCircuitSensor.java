package device;

import event.ShortCircuitEvent;
import house.House;
import iterator.HouseIterator;

/**
 * Represents a Circuit Sensor.
 */
public class ShortCircuitSensor extends Sensor {
  private House house;

  public ShortCircuitSensor(House house) {
    this.house = house;
  }

  public void handle(ShortCircuitEvent event) {
    event.setHandler(this);

    HouseIterator it = house.iterator();

    while(it.hasNext()) {
      for(Device d : it.next().getDevices()) {
        if (d.criticalPriority < 5) {
          d.turnOff();
        }
      }
    }
  }
}

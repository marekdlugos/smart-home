package house;

import device.Device;
import device.Light;
import entity.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the rooms in the house.
 */
public class Room {
  private int id;
  private Floor floor;
  private List<Window> windows = new ArrayList<Window>();
  private List<Device> devices = new ArrayList<Device>();
  private List<Animal> occupants = new ArrayList<Animal>();

  protected Room() {}

  public Room(Floor floor) {
    this.floor = floor;
    this.floor.add(this);
    this.devices.add(new Light());
  }

  public void add(Window window) {
    window.setRoom(this);
    this.windows.add(window);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void place(Device device) {
    devices.add(device);
  }

  public Floor getFloor() {
    return floor;
  }

  /**
   * Switch all the lights off.
   * @return true once all the lights are switched off.
   */
  public boolean switchLightsOff() {
    for(Device d : devices) {
      if (d instanceof Light) {
        ((Light) d).turnOff();
      }
    }

    return true;
  }

  /**
   * Switch all the lights on.
   * @return true once all the lights are switched on.
   */
  public boolean switchLightsOn() {
    for(Device d : devices) {
      if (d instanceof Light) {
        ((Light) d).turnOn();
      }
    }

    return true;
  }

  /**
   * Gets all the devices in the room.
   * @return list of devices in the room.
   */
  public List<Device> getDevices() {
    return devices;
  }

  /**
   * Gets all the animals in the room.
   * @return list of animals in the room.
   */
  public List<Animal> getOccupants() {
    return occupants;
  }
}

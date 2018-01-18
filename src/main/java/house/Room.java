package house;

import device.Device;
import device.Light;
import entity.Animal;

import java.util.ArrayList;
import java.util.List;

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

  public boolean switchLightsOff() {
    for(Device d : devices) {
      if (d instanceof Light) {
        ((Light) d).turnOff();
      }
    }

    return true;
  }

  public boolean switchLightsOn() {
    for(Device d : devices) {
      if (d instanceof Light) {
        ((Light) d).turnOn();
      }
    }

    return true;
  }

  public List<Device> getDevices() {
    return devices;
  }

  public List<Animal> getOccupants() {
    return occupants;
  }
}

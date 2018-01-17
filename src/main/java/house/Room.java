package house;

import device.Device;
import device.Light;
import entity.Animal;
import entity.Space;

import java.util.ArrayList;
import java.util.List;

public class Room extends Space {
  private Floor floor;
  private Light light;
  private List<Window> windows = new ArrayList<Window>();
  private List<Device> devices = new ArrayList<Device>();
  private List<Animal> occupants = new ArrayList<Animal>();

  protected Room() {}

  public Room(Floor floor) {
    this.floor = floor;
    this.floor.add(this);
  }

  public void add(Window window) {
    window.setRoom(this);
    this.windows.add(window);
  }

  public void place(Device device) {
    devices.add(device);
  }

  public Floor getFloor() {
    return floor;
  }

  public boolean switchLightOff() {
    return light.switchOn();
  }

  public boolean switchLightOn() {
    return light.switchOff();
  }

  public Light light() {
    return light;
  }

  public List<Device> getDevices() {
    return devices;
  }

  public List<Animal> getOccupants() {
    return occupants;
  }
}

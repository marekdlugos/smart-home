package house;

import device.Device;
import device.Light;
import entity.Space;

import java.util.ArrayList;
import java.util.List;

public class Room extends Space {
  private Floor floor;
  private Light light;
  private List<OutdoorBlind> blinds = new ArrayList<OutdoorBlind>();

  private List<Device> devices;

  protected Room() {}

  public Room(Floor floor) {
    this.floor = floor;
    this.floor.add(this);
    this.devices = new ArrayList<Device>();
  }

  public void add(OutdoorBlind blind) {
    blind.setRoom(this);
    this.blinds.add(blind);
  }

  public Floor getFloor() {
    return floor;
  }

  public void setFloor(Floor floor) {
    this.floor = floor;
  }

  public boolean isLocked() {
    return false;
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

  public void place(Device device) {
    devices.add(device);
  }
}

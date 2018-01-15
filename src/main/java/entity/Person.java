package entity;

import activity.Activity;
import activity.ActivityMachine;
import device.Device;
import house.Room;

import java.util.Date;

public class Person {
  private Room currentRoom;
  private Device currentDevice;

  public void enterRoom(Room room) {

  }

  public void use(Device device) {
    this.currentDevice = device;
    this.currentDevice.setCurrentUser(this);

    ActivityMachine.record(new Activity(this, device, new Date()));
  }
}

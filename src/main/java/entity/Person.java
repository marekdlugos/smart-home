package entity;

import activity.Activity;
import activity.ActivityMachine;
import device.Device;
import house.Room;

import java.util.Date;

public class Person extends Animal {
  private Device currentDevice;

  public boolean use(Device device) {
    if (device.getCurrentUser() != null) {
      return false;
    }

    this.currentDevice = device;
    this.currentDevice.setCurrentUser(this);

    ActivityMachine.record(new Activity(this, device, new Date()));

    return true;
  }

  public Device getCurrentDevice() {
    return currentDevice;
  }

  public void release() {
    this.currentDevice.setCurrentUser(null);
    this.currentDevice = null;
  }

  public boolean isUsingDevice() {
    return currentDevice != null;
  }
}

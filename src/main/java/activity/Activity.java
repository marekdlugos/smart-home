package activity;

import entity.Person;
import device.Device;
import java.util.Date;

public class Activity {
  private Person person;
  private Device device;
  private Date usedAt;

  public Activity(Person person, Device device, Date usedAt) {
    this.person = person;
    this.device = device;
    this.usedAt = usedAt;
  }
}

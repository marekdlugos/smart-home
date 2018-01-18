package activity;

import entity.Person;
import device.Device;
import entity.Tool;

import java.util.Date;

public class Activity {
  private Person person;
  private Tool tool;
  private Date usedAt;

  public Activity(Person person, Tool tool, Date usedAt) {
    this.person = person;
    this.tool = tool;
    this.usedAt = usedAt;
  }
}

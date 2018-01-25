package activity;

import entity.Person;
import device.Device;
import entity.Tool;

import java.util.Date;

/**
 * Represents an activity. There is always a person that does that activity. Tool that person uses for the activity and the date when the activity was performed.
 */
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

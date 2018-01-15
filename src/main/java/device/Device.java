package device;

import entity.Entity;
import entity.Person;

public class Device extends Entity {
  private int warranty; // stands for time left till the device will break
  private int criticalPriority;
  private Long createdAt;
  private Person currentUser;

  public Device() {
    this.createdAt = System.currentTimeMillis();
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public Person getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(Person currentUser) {
    this.currentUser = currentUser;
  }
}

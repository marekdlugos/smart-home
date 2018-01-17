package device;

import entity.Entity;
import entity.Person;

public class Device extends Entity {
  private int warranty; // stands for time left till the device will break
  private int criticalPriority;
  private Long createdAt;
  protected Long stateLastChangedAt;
  private Person currentUser;
  private DeviceState state;


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

  public DeviceManual getManual() {
    return DeviceManual.fetch(this);
  }

  public void touchStateChangedAt() {
    this.stateLastChangedAt = System.currentTimeMillis();
  }



//
//  public boolean turnOn() {
//    return this.state.pressStandbyButton(this);
//  }
//
//  public boolean turnOff() {
//    return this.state.pressStandbyButton(this);
//  }

  public boolean isActive() {
    return false;
  }
}

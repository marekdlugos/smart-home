package device;

import entity.Entity;

public class Device extends Entity {
  private int warranty; // stands for time left till the device will break
  private int criticalPriority;
  private Long createdAt;

  public Device() {
    this.createdAt = System.currentTimeMillis();
  }

  public Long getCreatedAt() {
    return createdAt;
  }
}

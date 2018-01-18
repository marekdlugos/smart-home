package device;

import entity.Tool;
import event.ExpiredWarrantyEvent;

public class Device extends Tool {
  private int warranty; // stands for time left till the device will break
  protected int criticalPriority;
  private Long createdAt;
  protected Long stateLastChangedAt;
  protected DeviceState state;
  private Double energyConsumed;

  public Device() {
    this.createdAt = System.currentTimeMillis();
    this.stateLastChangedAt = this.createdAt;
    this.energyConsumed = 0.0;
    this.criticalPriority = 1;
    this.warranty = 730;
  }

  protected Long getCreatedAt() {
    return createdAt;
  }

  public DeviceManual getManual() {
    return DeviceManual.fetch(this);
  }

  public void setState(DeviceState newState) {
    getEnergyConsumed();

    this.state = newState;
  }

  private void touchStateChangedAt() {
    this.stateLastChangedAt = System.currentTimeMillis();
  }

  private double calculateConsumption(Long from, Long to, Double rate) {
    // consumption rate is always defined per hour
    return ((to - from)/3600000.0)*rate;
  }

  public Double getEnergyConsumed() {
    this.energyConsumed += calculateConsumption(this.stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

    this.touchStateChangedAt();

    return energyConsumed;
  }

  public Integer getCriticalPriority() {
    return criticalPriority;
  }

  public Integer getWarranty() {
    this.warranty -= Math.round((System.currentTimeMillis() - createdAt)/86400000.0);

    if (warranty <= 0) {
      emit(new ExpiredWarrantyEvent());
    }

    return warranty;
  }
}

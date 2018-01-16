package device;

import device.phone.PhoneState;
import device.phone.TurnedOffState;
import event.Event;

public class Phone extends Device {
  private String number;

  private PhoneState state;
  private Long stateLastChangedAt;
  private Double energyConsumed;

  public Phone() {
    super();
    this.stateLastChangedAt = this.getCreatedAt();
    this.energyConsumed = 0.0;
    this.state = new TurnedOffState();
  }

  public void setState(PhoneState state) {
    this.energyConsumed += calculateConsumption(stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

    touchStateChangedAt();

    this.state = state;
  }

  public double calculateConsumption(Long from, Long to, Double consumptionPerHour) {
    return 0;
  }

  public void touchStateChangedAt() {
    this.stateLastChangedAt = System.currentTimeMillis();
  }

  public boolean call(String number) {
    return this.state.call(this, number);
  }

  public boolean turnOn() {
    return this.state.pressStandbyButton(this);
  }

  public boolean turnOff() {
    return this.state.pressStandbyButton(this);
  }

  public boolean switchOn() {
    return this.state.pressFireButton(this);
  }

  public boolean switchOff() {
    return this.state.pressStopButton(this);
  }

  public boolean hang() {
    return this.state.hang(this);
  }

  public boolean empty() {
    return this.getNumber().length() == 0;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String contents) {
    this.number = contents;
  }

//  public void handle(SpecialEvent event) {
//    event.setHandler(this);
//  }

  public void handle(Event event) {
    event.setHandler(this);
  }
}

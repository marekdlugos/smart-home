package device;

import device.cdplayer.ActiveState;
import device.cdplayer.CDPlayerState;
import device.cdplayer.TurnedOffState;
import event.Event;

public class CDPlayer extends Device {
  private String contents = "";

  private CDPlayerState state;
  private Double energyConsumed;

  public CDPlayer() {
    super();
    this.energyConsumed = 0.0;
    this.state = new TurnedOffState();
  }

  public void setState(CDPlayerState state) {
    this.energyConsumed += calculateConsumption(stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

    touchStateChangedAt();

    this.state = state;
  }

  public double calculateConsumption(Long from, Long to, Double consumptionPerHour) {
    Long period = to - from;
    Double totalConsumption = period * consumptionPerHour;
    return (this.energyConsumed =+ totalConsumption);
  }

  public boolean place(String contents) {
    return this.state.place(this, contents);
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

  public boolean withdraw() {
    return this.state.withdraw(this);
  }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

//  public void handle(SpecialEvent event) {
//    event.setHandler(this);
//  }

//  public void handle(Event event) {
//    event.setHandler(this);
//  }

  public boolean isSwitchedOn() {
    return this.state instanceof ActiveState;
  }
}

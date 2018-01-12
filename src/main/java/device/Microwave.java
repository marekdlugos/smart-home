package device;

import device.microwave.MicrowaveState;
import device.microwave.TurnedOffState;

import event.Event;

public class Microwave extends Device {
  private String contents;

  private MicrowaveState state;
  private Long stateLastChangedAt;
  private Double energyConsumed;

  public Microwave() {
    super();
    this.stateLastChangedAt = this.getCreatedAt();
    this.energyConsumed = 0.0;
    this.state = new TurnedOffState();
  }

  public void setState(MicrowaveState state) {
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

  public void handle(ThisEvent event) {
    System.out.println("Handled thisevent event " + event + " by " + this);

    event.setHandler(this);
  }

  public void handle(Event event) {
//    this.handle();
    System.out.println("Handled normal event " + event);
  }
}

package device;

import device.television.ActiveState;
import device.television.TelevisionState;
import device.television.TurnedOffState;
import event.Event;

public class Television extends Device {

    private String tvchannel;

    private TelevisionState state;
    private Long stateLastChangedAt;
    private Double energyConsumed;

    public Television() {
      super();
      this.energyConsumed = 0.0;
      this.state = new TurnedOffState();
    }

    public void setState(TelevisionState state) {
      this.energyConsumed += calculateConsumption(stateLastChangedAt, System.currentTimeMillis(), state.getConsumptionRate());

      touchStateChangedAt();

      this.state = state;
    }

    public double calculateConsumption(Long from, Long to, Double consumptionPerHour) {
      Long period = to - from;
      Double totalConsumption = period * consumptionPerHour;
      return (this.energyConsumed =+ totalConsumption);
    }

    public void touchStateChangedAt() {
      this.stateLastChangedAt = System.currentTimeMillis();
    }

    public boolean watch(String tvchannel) {
      return this.state.watch(this, tvchannel);
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

    public String getTvchannel() {
      return tvchannel;
    }

    public void setTvchannel(String tvchannel) {
      this.tvchannel = tvchannel;
    }

//  public void handle(SpecialEvent event) {
//    event.setHandler(this);
//  }

    public void handle(Event event) {
      event.setHandler(this);
    }

  public boolean isSwitchedOn() {
    return this.state instanceof ActiveState;
  }
}

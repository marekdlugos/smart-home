package device;

import device.television.ActiveState;
import device.television.TelevisionState;
import device.television.TurnedOffState;
import event.Event;

/**
 * Represents a Television.
 */
public class Television extends Device {
  private String tvchannel = "";

  public Television() {
    super();
    this.state = new TurnedOffState();
    this.criticalPriority = 4;
  }

  public boolean watch(String tvchannel) {
    return getState().watch(this, tvchannel);
  }

  public boolean turnOn() {
    return getState().pressStandbyButton(this);
  }

  public boolean turnOff() {
    return getState().pressStandbyButton(this);
  }

  public boolean switchOn() {
    return getState().pressFireButton(this);
  }

  public boolean switchOff() {
    return getState().pressStopButton(this);
  }

  public String getTvchannel() {
    return tvchannel;
  }

  public void setTvchannel(String tvchannel) {
    this.tvchannel = tvchannel;
  }

  public boolean isSwitchedOn() {
    return getState() instanceof ActiveState;
  }

  public TelevisionState getState() {
    return (TelevisionState) state;
  }

  public boolean isActive() {
    return this.state instanceof ActiveState;
  }
}

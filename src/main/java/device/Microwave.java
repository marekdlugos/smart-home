package device;

import device.microwave.ActiveState;
import device.microwave.MicrowaveState;
import device.microwave.TurnedOffState;

import event.Event;

public class Microwave extends Device {
  private String contents = "";

  public Microwave() {
    super();
    this.state = new TurnedOffState();
    this.criticalPriority = 3;
  }

  public boolean place(String contents) {
    return getState().place(this, contents);
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

  public boolean withdraw() {
    return getState().withdraw(this);
  }

  public boolean empty() {
    return this.getContents().length() == 0;
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

  public boolean isSwitchedOn() {
    return getState() instanceof ActiveState;
  }

  public MicrowaveState getState() {
    return (MicrowaveState) state;
  }
}

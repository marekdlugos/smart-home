package device;

import device.cdplayer.ActiveState;
import device.cdplayer.CDPlayerState;
import device.cdplayer.TurnedOffState;
import event.Event;

public class CDPlayer extends Device {
  private String contents = "";

  public CDPlayer() {
    super();
    this.state = new TurnedOffState();
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
    return getState() instanceof ActiveState;
  }

  public CDPlayerState getState() {
    return (CDPlayerState) state;
  }
}

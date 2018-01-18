package device;

import device.light.ActiveState;
import device.light.LightState;
import device.light.TurnedOffState;

public class Light extends Device {
  public Light() {
    super();
    this.state = new TurnedOffState();
  }

  public boolean turnOn() {
    return getState().performSwitch(this);
  }

  public boolean turnOff() {
    return getState().performSwitch(this);
  }

  public boolean isActive() {
    return getState() instanceof ActiveState;
  }

  public LightState getState() {
    return (LightState) state;
  }
}

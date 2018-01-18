package device.light;

import device.DeviceState;
import device.Light;

public abstract class LightState implements DeviceState {
  public abstract boolean performSwitch(Light light);
}

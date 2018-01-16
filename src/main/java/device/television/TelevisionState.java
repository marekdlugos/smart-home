package device.television;

import device.DeviceState;
import device.Television;

public abstract class TelevisionState implements DeviceState {
  public abstract boolean pressStandbyButton(Television television);
  public abstract boolean pressFireButton(Television television);
  public abstract boolean pressStopButton(Television television);
  public abstract boolean watch(Television television, String tvchannel);
}

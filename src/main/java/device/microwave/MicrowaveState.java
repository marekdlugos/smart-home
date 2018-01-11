package device.microwave;

import device.Microwave;
import device.DeviceState;

public abstract class MicrowaveState implements DeviceState {
  public abstract boolean pressStandbyButton(Microwave microwave);
  public abstract boolean pressFireButton(Microwave microwave);
  public abstract boolean pressStopButton(Microwave microwave);
  public abstract boolean place(Microwave microwave, String contents);
  public abstract boolean withdraw(Microwave microwave);
}

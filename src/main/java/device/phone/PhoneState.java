package device.phone;

import device.DeviceState;
import device.Phone;

public abstract class PhoneState implements DeviceState {
  public abstract boolean pressStandbyButton(Phone phone);
  public abstract boolean pressFireButton(Phone phone);
  public abstract boolean pressStopButton(Phone phone);
  public abstract boolean call(Phone phone, String number);
  public abstract boolean hang(Phone phone);
}

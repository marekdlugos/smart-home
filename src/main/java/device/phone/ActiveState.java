package device.phone;

import device.Phone;

public class ActiveState extends PhoneState {
  public boolean pressStandbyButton(Phone phone) {
    return false;
  }

  public boolean pressFireButton(Phone phone) {
    return false;
  }

  public boolean pressStopButton(Phone phone) {
    phone.setState(new IdleState());

    return true;
  }

  public boolean call(Phone phone, String number) {
    return false;
  }

  public boolean hang(Phone phone) {
    return false;
  }

  public double getConsumptionRate() {
    return 100;
  }
}

package device.phone;

import device.Phone;

public class TurnedOffState extends PhoneState {
  public boolean pressStandbyButton(Phone phone) {
    phone.setState(new IdleState());
    return true;
  }

  public boolean pressFireButton(Phone phone) {
    return false;
  }

  public boolean pressStopButton(Phone phone) {
    return false;
  }

  public boolean call(Phone phone, String number) {
    if (phone.getNumber().length() > 0) {
      return false;
    }

    phone.setNumber(number);
    return true;
  }

  public boolean hang(Phone phone) {
    phone.setNumber("");
    return true;
  }

  public double getConsumptionRate() {
    return 0;
  }
}

package device.phone;

import device.Phone;

public class IdleState extends PhoneState {
  public boolean pressStandbyButton(Phone phone) {
    phone.setState(new TurnedOffState());
    return true;
  }

  public boolean pressFireButton(Phone phone) {
    phone.setState(new ActiveState());
    return true;
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
    return 10;
  }
}

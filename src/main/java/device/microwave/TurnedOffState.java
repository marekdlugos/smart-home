package device.microwave;

import device.Microwave;

public class TurnedOffState extends MicrowaveState {
  public boolean pressStandbyButton(Microwave microwave) {
    microwave.setState(new IdleState());
    return true;
  }

  public boolean pressFireButton(Microwave microwave) {
    return false;
  }

  public boolean pressStopButton(Microwave microwave) {
    return false;
  }

  public boolean place(Microwave microwave, String contents) {
    if (microwave.getContents().length() > 0) {
      return false;
    }

    microwave.setContents(contents);
    return true;
  }

  public boolean withdraw(Microwave microwave) {
    microwave.setContents("");
    return true;
  }

  public double getConsumptionRate() {
    return 0;
  }
}

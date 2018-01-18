package device.microwave;

import device.Microwave;
import event.FoodReadyEvent;

public class ActiveState extends MicrowaveState {
  public boolean pressStandbyButton(Microwave microwave) {
    return false;
  }

  public boolean pressFireButton(Microwave microwave) {
    return false;
  }

  public boolean pressStopButton(Microwave microwave) {
    microwave.setState(new IdleState());

    if (!microwave.empty()) {
      microwave.emit(new FoodReadyEvent(microwave.getCurrentUser()));
    }

    return true;
  }

  public boolean place(Microwave microwave, String contents) {
    return false;
  }

  public boolean withdraw(Microwave microwave) {
    return false;
  }

  public double getConsumptionRate() {
    return 100;
  }
}

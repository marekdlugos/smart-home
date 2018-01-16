package device.television;

import device.Television;

public class TurnedOffState extends TelevisionState {
  public boolean pressStandbyButton(Television television) {
    television.setState(new IdleState());
    return true;
  }

  public boolean pressFireButton(Television television) {
    return false;
  }

  public boolean pressStopButton(Television television) {
    return false;
  }

  public boolean watch(Television television, String tvchannel) {
    if (television.getTvchannel().length() > 0) {
      return false;
    }

    television.watch(tvchannel);
    return true;
  }

  public double getConsumptionRate() {
    return 0;
  }
}

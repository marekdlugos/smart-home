package device.television;

import device.Television;

public class IdleState extends TelevisionState {
  public boolean pressStandbyButton(Television television) {
    television.setState(new TurnedOffState());
    return true;
  }

  public boolean pressFireButton(Television television) {
    television.setState(new ActiveState());
    return true;
  }

  public boolean pressStopButton(Television television) {
    return false;
  }

  public boolean watch(Television television, String tvchannel) {
    if (television.getTvchannel().length() > 0) {
      return false;
    }

    television.setTvchannel(tvchannel);
    return true;
  }

  public double getConsumptionRate() {
    return 10;
  }
}

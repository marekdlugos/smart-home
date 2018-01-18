package device.television;

import device.Television;

public class ActiveState extends TelevisionState {
  public boolean pressStandbyButton(Television television) {
    return false;
  }

  public boolean pressFireButton(Television television) {
    television.setState(new ActiveState());
    return true;
  }

  public boolean pressStopButton(Television television) {
    television.setState(new IdleState());
    return true;
  }

  public boolean watch(Television television, String tvchannel) {
    return false;
  }

  public double getConsumptionRate() {
    return 100;
  }
}

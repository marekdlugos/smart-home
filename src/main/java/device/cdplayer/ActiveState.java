package device.cdplayer;

import device.CDPlayer;

public class ActiveState extends CDPlayerState {
  public boolean pressStandbyButton(CDPlayer cdplayer) {
    return false;
  }

  public boolean pressFireButton(CDPlayer cdplayer) {
    return false;
  }

  public boolean pressStopButton(CDPlayer cdplayer) {
    cdplayer.setState(new IdleState());
    return true;
  }

  public boolean place(CDPlayer cdplayer, String contents) {
    return false;
  }

  public boolean withdraw(CDPlayer cdplayer) {
    return false;
  }

  public double getConsumptionRate() {
    return 100;
  }
}

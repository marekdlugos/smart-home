package device.cdplayer;

import device.CDPlayer;

public class TurnedOffState extends CDPlayerState {
  public boolean pressStandbyButton(CDPlayer cdplayer) {
    cdplayer.setState(new IdleState());
    return true;
  }

  public boolean pressFireButton(CDPlayer cdplayer) {
    return false;
  }

  public boolean pressStopButton(CDPlayer cdplayer) {
    return false;
  }

  public boolean place(CDPlayer cdplayer, String contents) {
    if (cdplayer.getContents().length() > 0) {
      return false;
    }

    cdplayer.setContents(contents);
    return true;
  }

  public boolean withdraw(CDPlayer cdplayer) {
    cdplayer.setContents("");
    return true;
  }

  public double getConsumptionRate() {
    return 0;
  }
}

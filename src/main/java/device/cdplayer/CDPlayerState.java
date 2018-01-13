package device.cdplayer;

import device.DeviceState;
import device.CDPlayer;

public abstract class CDPlayerState implements DeviceState {
  public abstract boolean pressStandbyButton(CDPlayer cdplayer);
  public abstract boolean pressFireButton(CDPlayer cdplayer);
  public abstract boolean pressStopButton(CDPlayer cdplayer);
  public abstract boolean place(CDPlayer cdplayer, String contents);
  public abstract boolean withdraw(CDPlayer cdplayer);
}


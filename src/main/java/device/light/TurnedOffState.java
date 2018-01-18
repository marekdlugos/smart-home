package device.light;

import device.Light;

public class TurnedOffState extends LightState {
  public double getConsumptionRate() {
    return 0;
  }

  public boolean performSwitch(Light light) {
    light.setState(new ActiveState());

    return true;
  }
}

package device.light;

import device.Light;

public class ActiveState extends LightState {
  public double getConsumptionRate() {
    return 5;
  }

  public boolean performSwitch(Light light) {
    light.setState(new TurnedOffState());

    return true;
  }
}

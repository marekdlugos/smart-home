package device.fridge;

public class TurnedOffState extends FridgeState {
  public double getConsumptionRate() {
    return 100.0;
  }
}

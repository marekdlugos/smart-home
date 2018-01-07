package device;

public class TurnedOnState implements State {
    @Override
    public void doAction(Device device) {
        System.out.println("Device was turned on.");
        device.setState(this);
    }

    @Override
    public String toString() {
        return "Turn On State";
    }
}

package device;

public class IdleState implements State {
    @Override
    public void doAction(Device device) {
        System.out.println("Device is in the Idle state.");
        device.setState(this);
    }

    @Override
    public String toString() {
        return "Idle State";
    }
}

package fel.sit.omo;

import javax.naming.Context;

public class TurnedOffState implements State {
    @Override
    public void doAction(Device device) {
        System.out.println("Device was turned off.");
        device.setState(this);
    }

    @Override
    public String toString() {
        return "Turn Off State";
    }
}

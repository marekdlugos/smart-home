package device;

public class Microwave extends Device {
    public Microwave(State state, int turnedOnConsumption, int turnedOffConsumption, int idleConsumption, String unit, int warranty, int criticalPriority) {
        super(state, turnedOnConsumption, turnedOffConsumption, idleConsumption, unit, warranty, criticalPriority);
    }
}

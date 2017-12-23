package fel.sit.omo;

public class Device {

    private State state;
    private final int turnedOnConsumption;
    private final int turnedOffConsumption;
    private final int idleConsumption;
    private final String unit;
    private int warranty;
    private int criticalPriority;

    public Device(State state, int turnedOnConsumption, int turnedOffConsumption, int idleConsumption, String unit, int warranty, int criticalPriority) {
        this.state = state;
        this.turnedOnConsumption = turnedOnConsumption;
        this.turnedOffConsumption = turnedOffConsumption;
        this.idleConsumption = idleConsumption;
        this.unit = unit;
        this.warranty = warranty;
        this.criticalPriority = criticalPriority;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

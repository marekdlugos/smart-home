package fel.sit.omo;

public class Person {

    private String familyRole;
    private boolean isUsingDevice;

    public void shutWaterStream(){
        System.out.println("Water Stream was closed.");
    }

    public void call(int number){
        System.out.println("Called " + number + " .");
    }

    public void hide(){
        // TODO: Person should be "invisible" here?
    }

    public <T extends Device> find(String name, Class<T> type){
        // find method
    }

    public void read(String document){
        System.out.println("Reading " + document + " .");
    }

    public void buy(Object object){
        // buy method
    }

    public void use(Device device){
        System.out.println(this + " is using " + device + ".");
        int currentWarranty = device.getWarranty();
        currentWarranty--;
        device.setWarranty(currentWarranty);
    }

    public boolean isUsingDevice() {
        return isUsingDevice;
    }

    public void setUsingDevice(boolean usingDevice) {
        isUsingDevice = usingDevice;
    }

    public void wait() {
        // wait method
    }
}

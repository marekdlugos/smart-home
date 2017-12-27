package entity;

public class Person {
  private String firstName;
  private FamilyRole familyRole;
  private boolean isUsingDevice;
  private Room currentRoom;

  public Person(String firstName, FamilyRole familyRole, boolean isUsingDevice, Room currentRoom) {
    this.firstName = firstName;
    this.familyRole = familyRole;
    this.isUsingDevice = isUsingDevice;
    this.currentRoom = currentRoom;
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Person was created {" +
            "First Name='" + firstName + '\'' +
            ", Family Role=" + familyRole +
            ", Is using Device?=" + isUsingDevice +
            ", Is located in=" + currentRoom +
            '}';
  }

  public void shutWaterStream() {
    System.out.println("Water Stream was closed.");
  }

  public void call(int number) {
    System.out.println("Called " + number + " .");
  }

  public void hide() {
    // TODO: Person should be "invisible" here?
  }

//    public <T extends Device> find(String name, Class<T> type){
//        // find method
//    }

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

//    public void wait() {
//        // wait method
//    }

  public void enterRoom(Room room) {

  }
}

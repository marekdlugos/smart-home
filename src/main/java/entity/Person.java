package entity;

import device.Device;
import house.Room;

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

  public void enterRoom(Room room) {

  }
}

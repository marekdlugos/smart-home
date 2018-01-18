package entity;

import house.Room;

public abstract class Animal extends Entity {
  protected Animal() {
    super();
  }

  private Room currentRoom;

  public void enterRoom(Room room) {
    if(this.currentRoom != null) {
      this.currentRoom.getOccupants().remove(this);
    }

    this.currentRoom = room;
    this.currentRoom.getOccupants().add(this);
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }
}

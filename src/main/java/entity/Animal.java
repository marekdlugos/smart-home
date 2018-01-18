package entity;

import house.Room;

public abstract class Animal extends Entity {
  protected Animal() {
    super();
  }

  private Room currentRoom;

  public void enterRoom(Room room) {
    this.currentRoom = room;
    room.getOccupants().add(this);
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }
}

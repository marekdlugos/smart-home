package house;

import entity.Space;

import java.util.List;
import java.util.ArrayList;

public class Floor extends Space {
  private List<Room> rooms = new ArrayList<Room>();
  private House house;

//  protected Floor() {}

  public Floor() {
//    System.out.println("Floor was created.");
//    this.house = house;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public void add(Room room) {
    this.rooms.add(room);
  }

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }
}

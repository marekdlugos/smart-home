package house;

import com.fasterxml.jackson.annotation.JsonProperty;
import entity.Space;

import java.util.List;
import java.util.ArrayList;

public class Floor extends Space {

  @JsonProperty("id")
  private int id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("floor")
  private Integer floor;

  private List<Room> rooms = new ArrayList<Room>();
  private House house;

  //  protected Floor() {}

  public Floor() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

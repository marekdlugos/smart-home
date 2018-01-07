package house;

import java.util.ArrayList;
import java.util.List;

public class House {
  private List<Floor> floors = new ArrayList<Floor>();

  public House() {
    floors.add(new Floor());
  }

  public void add(Floor floor) {

  }

  public Floor floor(int floorNumber) {
    return floors.get(floorNumber);
  }

  public List<Floor> getFloors() {
    return floors;
  }

  public List<Room> fetchRooms() {
    return null;
  }

  boolean isLocked() {
    return floor(0).getRooms().get(0).isLocked();
  }
}

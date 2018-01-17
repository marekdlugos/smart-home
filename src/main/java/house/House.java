package house;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import device.Sensor;
import entity.Animal;
import iterator.HouseIterator;

public class House {
  private List<Floor> floors = new ArrayList<Floor>();
  private List<Animal> inhabitants = new ArrayList<Animal>();
  private List<Sensor> sensors = new ArrayList<Sensor>();

  public House() {
    floors.add(new Floor());
  }

  public void add(Floor floor) {
    floor.setHouse(this);
    this.floors.add(floor);
  }

  public void add(Integer floorNumber, Room room) {
    floors.get(floorNumber).add(room);
  }

  public Floor floor(int floorNumber) {
    return floors.get(floorNumber);
  }

  public List<Floor> getFloors() {
    return floors;
  }

  public HouseIterator iterator() {
    return new HouseIterator(this);
  }

  public void register(Animal animal) {
    inhabitants.add(animal);
  }

  public List<Animal> getInhabitants() {
    return inhabitants;
  }
}

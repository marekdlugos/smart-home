package fel.sit.omo;

public class House {

  public House() {
        System.out.println("House was created.");
    }

  // TODO: Should probably follow state pattern so that we can't lock house twice (the same with window entity)
  public void lock() {
    System.out.println("House was locked.");
  }

  public void unlock() {
    System.out.println("House was unlocked.");
  }

  public add(Room room);
  public add(Floor floor);
  public add(Device device);

}

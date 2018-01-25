package house;

/**
 * Represents the windows in the House.
 */
public class Window {
  private Room room;
  private boolean isOpened = false;

  public Window(Room room) {
    this.room = room;
  }

  public boolean isOpened() {
    return isOpened;
  }

  public void close() {
    isOpened = false;
  }

  public void open() {
    isOpened = true;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }
}

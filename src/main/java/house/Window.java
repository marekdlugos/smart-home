package house;

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
}

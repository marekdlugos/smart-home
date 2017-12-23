package fel.sit.omo;

public class Window {
    private Room room;
    private boolean isOpened;

    public Window(Room room, boolean isOpened) {
        this.room = room;
        this.isOpened = isOpened;
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

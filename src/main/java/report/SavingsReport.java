package report;

import device.Device;
import house.Floor;
import house.House;
import house.Room;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;


/**
 * Report that will generate a list of all devices that were switched on and not used at the same time.
 */
public class SavingsReport implements Report {
  private List<Device> devices;
  private House house;
  private StringBuilder report;

  private static final String header = "------------------ Savings Report ------------------\n\n";

  private static final String footer = "\n------------------ End of Report -------------------\n";

  public SavingsReport(House house) {
    this.house = house;
    report = new StringBuilder();
    report.append(header);
  }


  private void appendStuff() {
    List<Floor> floors = house.getFloors();

    int index = 1;

    for (Floor floor : floors) {
      appendRooms(floor.getRooms());
      report.append("\n");
      index++;
    }
    report.append(footer);
  }

  private void appendRooms(List<Room> rooms) {
    for (Room room : rooms) {
      appendDevices(room.getDevices());
    }
  }


  private void appendDevices(List<Device> devices) {
    report.append("    Devices\n");
    for (Device device : devices) {
      report.append("        " + device.getClass().getSimpleName() + "\n");
    }
  }

  public void generate() {
    try (PrintStream out = new PrintStream(new FileOutputStream("SavingsReport.txt"))) {
      out.print(report);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void print() {
    appendStuff();
    System.out.println(report);
  }
}

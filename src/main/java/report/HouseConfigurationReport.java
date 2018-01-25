package report;

import device.Device;
import house.Floor;
import house.House;
import house.Room;
import iterator.HouseIterator;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * The whole configuration of the House.
 */
public class HouseConfigurationReport implements Report {
  private House house;
  private List<Room> rooms;
  private List<Floor> floors;

  private StringBuilder report;

  private static final String header = "------------- House Configuration Report -------------\n\n";

  private static final String footer = "\n------------------ End of Report -------------------\n";

  /**
   * Creates a new House config report. Append the header of the report.
   * @param house The House config report will be generated according to the house passed in this param.
   */
  public HouseConfigurationReport(House house) {
    this.house = house;
    report = new StringBuilder();
    report.append(header);
  }

  /**
   * Iterate through the floors and rooms and print out the actual report.
   */
  private void appendStuff() {
    List<Floor> floors = house.getFloors();

    int index = 1;

    for (Floor floor : floors) {
      report.append("Floor no. " + index + "\n");
      appendRooms(floor.getRooms());
      report.append("\n");
      index++;
    }
    report.append(footer);
  }

  /**
   * Print out the rooms and devices list.
   * @param rooms A list of the rooms.
   */
  private void appendRooms(List<Room> rooms) {
    report.append("Rooms\n");
    for (Room room : rooms) {
      report.append("  " + room.getClass().getSimpleName() + "\n");
      appendDevices(room.getDevices());
    }
  }

  /**
   * Print out the devices list.
   * @param devices A list of devices in the house.
   */
  private void appendDevices(List<Device> devices) {
    report.append("    Devices\n");
    for (Device device : devices) {
      report.append("        " + device.getClass().getSimpleName() + "\n");
    }
  }

  /**
   * Print the result (finished report) into the file.
   */
  public void generate() {
    try (PrintStream out = new PrintStream(new FileOutputStream("HouseConfigurationReport.txt"))) {
      out.print(report);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  /**
   * Print the report on the console line.
   */
  public void print() {
    appendStuff();
    System.out.println(report);
  }
}

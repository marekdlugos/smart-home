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

public class HouseConfigurationReport implements Report {
  private House house;
  private List<Room> rooms;
  private List<Floor> floors;

  private StringBuilder report;

  private static final String header = "------------- House Configuration Report -------------\n\n";

  private static final String footer = "\n------------------ End of Report -------------------\n";

  public HouseConfigurationReport(House house) {
    this.house = house;
    report = new StringBuilder();
    report.append(header);
  }


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

  private void appendRooms(List<Room> rooms) {
    report.append("Rooms\n");
    for (Room room : rooms) {
      report.append("  " + room.getClass().getSimpleName() + "\n");
      appendDevices(room.getDevices());
    }
  }

  private void appendDevices(List<Device> devices) {
    report.append("    Devices\n");
    for (Device device : devices) {
      report.append("        " + device.getClass().getSimpleName() + "\n");
    }
  }


  public void print() {
    appendStuff();
    System.out.println(report);


//    PrintWriter writer = null;
//    try {
//      HouseIterator it = house.iterator();
//      writer = new PrintWriter("/Users/Marek/Desktop/House-Config-Report.txt", "UTF-8");
//      writer.println("------------------------- HOUSE CONFIGURATION REPORT -------------------------");
////      while(it.hasNext()) {
////        writer.println(it.next().getFloor().getRooms());
////        writer.println(it.next().getFloor().getHouse());
////        writer.println(it.next().getFloor().getClass() + " -> " + it.next().getClass());
////      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (UnsupportedEncodingException e) {
//      e.printStackTrace();
//    }
//
//    writer.close();

    // HOUSE
    // HOUSE -> Floor 1 []
    // HOUSE -> Floor 1 -> Room 1 []
    // HOUSE -> Floor 1 -> Room 2 []
    // HOUSE -> Floor 1 -> Room 3 []
    // HOUSE -> Floor 2 -> Room 4 []

  }
}

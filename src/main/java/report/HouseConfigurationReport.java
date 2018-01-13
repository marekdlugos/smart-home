package report;

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

  public HouseConfigurationReport(House house) {
    this.house = house;
  }

  public void print() {

    PrintWriter writer = null;
    try {
      HouseIterator it = house.iterator();
      writer = new PrintWriter("/Users/Marek/Desktop/House-Config-Report.txt", "UTF-8");
      writer.println("------------------------- HOUSE CONFIGURATION REPORT -------------------------");
//      while(it.hasNext()) {
//        writer.println(it.next().getFloor().getRooms());
//        writer.println(it.next().getFloor().getHouse());
//        writer.println(it.next().getFloor().getClass() + " -> " + it.next().getClass());
//      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

    writer.close();

    // HOUSE
    // HOUSE -> Floor 1 []
    // HOUSE -> Floor 1 -> Room 1 []
    // HOUSE -> Floor 1 -> Room 2 []
    // HOUSE -> Floor 1 -> Room 3 []
    // HOUSE -> Floor 2 -> Room 4 []

  }
}

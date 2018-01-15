import device.Device;
import device.Microwave;
import house.House;
import house.Room;
import house.Floor;
import house.Kitchen;
import iterator.HouseIterator;
import report.ConsumptionReport;
import report.HouseConfigurationReport;
import tree.Node;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Node firstHouseVersion = new Node(null);
    firstHouseVersion.setId(1);
    House house = new House();
    Room room1 = new Room(house.floor(0));
    Room room2 = new Room(house.floor(0));
    Room room4 = new Kitchen(house.floor(0));

    house.add(new Floor());

    Room room3 = new Room(house.floor(1));

    HouseIterator it = house.iterator();

    Microwave m = new Microwave();
    Microwave mc = new Microwave();
    m.subscribe();
    mc.subscribe();

    HouseConfigurationReport houseConfigReport = new HouseConfigurationReport(house);
    houseConfigReport.print();

    ArrayList<Device> devicesList = new ArrayList<Device>();
    devicesList.add(m);
    devicesList.add(mc);
    ConsumptionReport consumptionReport = new ConsumptionReport(devicesList);
    consumptionReport.print();

    firstHouseVersion.setHouseVersion(house);

//    while(it.hasNext()) {
//      System.out.println(it.next() + " " + it.next().getFloor());
//    }

    // factorize the shit
    // apply random cycle to them
    // make report
      // HouseConfigurationReport
        // veškerá konfigurační data domu zachovávající
        // hieararchii - dům -> patro -> místnost -> okno -> žaluzie atd. Plus jací jsou obyvatelé domu
      // EventReport
        // report eventů, kde grupujeme eventy podle typu, zdroje eventů a jejich cíle (jaká entita event odbavila)
      // ActivityAndUsageReport
        // Report akcí (aktivit) jednotlivých osob a zvířat, kolikrát které osoby použily které zařízení
      // ConsumptionReport
        // Kolik jednotlivé spotřebiče spotřebovaly eletřiny, plynu, vody. Včetně finančního vyčíslení
  }
}

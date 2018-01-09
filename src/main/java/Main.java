import house.House;
import house.Room;
import house.Floor;
import house.Kitchen;
import iterator.HouseIterator;

public class Main {
  public static void main(String[] args) {
    House house = new House();
    Room room1 = new Room(house.floor(0));
    Room room2 = new Room(house.floor(0));
    Room room4 = new Kitchen(house.floor(0));

    house.add(new Floor());

    Room room3 = new Room(house.floor(1));

    HouseIterator it = house.iterator();

    while(it.hasNext()) {
      System.out.println(it.next() + " " + it.next().getFloor());
    }

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

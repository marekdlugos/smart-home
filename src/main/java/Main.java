import device.*;
import event.EventMachine;
import event.FoodReadyEvent;
import house.*;
import iterator.HouseIterator;
import report.ConsumptionReport;
import report.EventReport;
import report.HouseConfigurationReport;
import report.SavingsReport;
import simulation.DummyHouse;
import simulation.NaiveSimulation;

import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {
//    new NaiveSimulation(DummyHouse.get()).simulate(4);
//    System.out.println(EventMachine.getEventCluster().getEvents().size());

    House house = new House();
    house.add(new Floor());
    house.add(new Floor());
    Kitchen kitchen = new Kitchen(house.floor(0));
    kitchen.place(new Microwave());
    kitchen.place(new Fridge());

    LivingRoom livingRoom = new LivingRoom(house.floor(0));
    livingRoom.place(new CDPlayer());

    Room room1 = new Room(house.floor(1));
    Room room2 = new Room(house.floor(1));

    room1.place(new Television());
    room2.place(new Phone());


//    for(int i = 0; i < 30; i++) {
//      System.out.println(EventMachine.getEventCluster().getEvents().get(i));
//    }

//    House house = new House();
//    Room room1 = new Room(house.floor(0));
//    Room room2 = new Room(house.floor(0));
//    Room room4 = new Kitchen(house.floor(0));
//
//    house.add(new Floor());
//
//    Room room3 = new Room(house.floor(1));
//
//    HouseIterator it = house.iterator();
//
//    Microwave m = new Microwave();
//    Microwave mc = new Microwave();
//    m.subscribe();
//    mc.subscribe();
//
//    m.emit(new FoodReadyEvent());
//    m.emit(new FoodReadyEvent());

//    EventReport r = new EventReport(EventMachine.getEventCluster().getEvents());
//    r.print();

    HouseConfigurationReport houseConfigReport = new HouseConfigurationReport(house);
    houseConfigReport.print();
    houseConfigReport.generate();

    SavingsReport savingsReport = new SavingsReport(house);
    savingsReport.print();
    savingsReport.generate();
//
//
//    ArrayList<Device> devicesList = new ArrayList<Device>();
//    devicesList.add(m);
//    devicesList.add(mc);
//    ConsumptionReport consumptionReport = new ConsumptionReport(devicesList);
//    consumptionReport.print();

//    firstHouseVersion.setHouseVersion(house);

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

import event.Event;
import event.EventMachine;
import report.HouseConfigurationReport;
import report.SavingsReport;
import simulation.DummyHouse;
import simulation.NaiveSimulation;

import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {
    new NaiveSimulation(DummyHouse.get()).simulate(3);

    for(Event e : EventMachine.getEventCluster().getEvents()) {
      System.out.println(e + " handler: " + e.getHandler());
    }

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

    HouseConfigurationReport houseConfigReport = new HouseConfigurationReport(DummyHouse.get());
    houseConfigReport.print();
    houseConfigReport.generate();

    SavingsReport savingsReport = new SavingsReport(DummyHouse.get());
    savingsReport.print();
    savingsReport.generate();

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

  }
}

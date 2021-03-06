package simulation;

import device.*;
import entity.Animal;
import entity.Person;
import entity.Tool;
import house.House;
import house.Room;
import iterator.HouseIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NaiveSimulation {
  private House house;

  public NaiveSimulation(House house) {
    this.house = house;
  }

  public void simulate(Integer duration) {
    System.out.println("Naive Simulation[" + this + "] began - duration: " + duration + " seconds");

    Long start = System.currentTimeMillis();

    while((System.currentTimeMillis() - start) < duration*1000) {
      for(Animal animal : house.getInhabitants()) {
        try {
          Thread.sleep(10);

        } catch (Exception e) {

        }

        if (animal instanceof Person) {
          Person p = (Person) animal;

          if (!p.isUsingTool()) {
            p.enterRoom(getRandomRoom(p));

            p.use(getRandomDevice(p.getCurrentRoom()));
//            System.out.println("random device: " + p.getCurrentTool() + " p: " + p);
          } else {
//            System.out.println("current device: " + p.getCurrentTool() + " p: " + p);
          }

          deviceScenario(p.getCurrentTool());
        }
      }
    }

    System.out.println("Naive Simulation[" + this + "] finished");
  }

  private Room getRandomRoom(Person person) {
    List<Room> rooms = new ArrayList<Room>();

    HouseIterator it = house.iterator();

    while(it.hasNext()) {
      rooms.add(it.next());
    }

    rooms.remove(person.getCurrentRoom());

    Random rand = new Random();

    Room randomRoom = rooms.get(rand.nextInt(rooms.size()));

    return randomRoom;
  }

  private Device getRandomDevice(Room room) {
    List<Device> devices = new ArrayList<Device>();

    Random rand = new Random();
    return room.getDevices().get(rand.nextInt(room.getDevices().size()));
  }

  private void deviceScenario(Tool device) {
    if (device instanceof Microwave) {
      deviceScenario((Microwave) device);
    } else if (device instanceof Fridge) {
      deviceScenario((Fridge) device);
    } else if (device instanceof CDPlayer) {
      deviceScenario((CDPlayer) device);
    } else if (device instanceof Light) {
      deviceScenario((Light) device);
    } else if (device instanceof Television) {
      deviceScenario((Television) device);
    }
  }

  private void deviceScenario(Microwave microwave) {
    if (microwave.isSwitchedOn()) {
      microwave.switchOff();
      microwave.turnOff();
      microwave.getCurrentUser().release();
      return;
    }

    microwave.turnOn();
    microwave.place(randomFood());
    microwave.switchOn();
  }

  private void deviceScenario(Fridge fridge)  {
    if (fridge.isSwitchedOn()) {
      fridge.turnOff();
      fridge.getCurrentUser().release();
      return;
    }

    fridge.turnOn();
    fridge.place(randomFood(), 5);
    fridge.withdraw(randomFood(), 10);
  }

  private void deviceScenario(CDPlayer cdPlayer)  {
    if (cdPlayer.isSwitchedOn()) {
      cdPlayer.turnOff();
      cdPlayer.getCurrentUser().release();
      return;
    }

    cdPlayer.turnOn();
    cdPlayer.place("Flexim ako Gott");
    cdPlayer.switchOn();
  }

  private void deviceScenario(Light light)  {
    if (light.isActive()) {
      light.turnOff();
      light.getCurrentUser().release();
      return;
    }

    light.turnOn();
  }

  private void deviceScenario(Television television)  {
    if (television.isActive()) {
      television.switchOff();
      television.turnOff();
      television.getCurrentUser().release();
      return;
    }

    television.switchOn();
    television.turnOn();
    television.watch("MTV");
  }

  private void deviceScenario(Phone phone)  {
    if (phone.isActive()) {
      phone.turnOff();
      phone.getCurrentUser().release();
      return;
    }

    phone.turnOn();
  }

  private String randomFood() {
    Random rand = new Random();
    return Arrays.asList("Pizza", "Egg", "Milk", "Soup", "Pasta", "Burrito", "Potato").get(rand.nextInt(7));
  }
}

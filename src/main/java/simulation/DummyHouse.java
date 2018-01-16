package simulation;

import device.*;
import entity.Child;
import entity.Dog;
import entity.Father;
import entity.Mother;
import house.*;

public class DummyHouse {
  public static House get() {
    House house = new House();
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

    Mother mother = new Mother();
    Father father = new Father();
    Child child = new Child();
    Dog dog = new Dog();

    house.register(mother);
    house.register(father);
    house.register(child);
    house.register(dog);

    return house;
  }
}

package fel.sit.omo;

public class Main {

    public static void main(String[] args) {

        // code

        // SIMULATION
        // House casaCamo
        // 2 floors
        // 9 rooms
        // 5 people — mom, dad, 3 children
        // things — Bike, Car, Ski, GasBoiler
        // pets — dog, cat
        // sensors — windSensor, circuitBreaker

        House casaCamo = new House();
        Floor basement = new Floor();
        Floor secondFloor = new Floor();
        Room livingRoom = new Room(basement);
        Room parentsBedRoom = new Room(basement);
        Room kitchen = new Room(basement);
        Room kidsBedRoom = new Room(secondFloor);
        Room bathRoom = new Room(secondFloor);
        Room diningRoom = new Room(basement);
        Room laundryRoom = new Room(secondFloor);
        Room homeOffice = new Room(secondFloor);
        Room garage = new Room(basement);
        Person mom = new Person("Barbie", FamilyRole.MOM, false, kitchen);
        Person dad = new Person("Ken", FamilyRole.DAD, false, homeOffice);
        Person jenny = new Person("Jenny", FamilyRole.DAUGHTER, false, kidsBedRoom);
        Person josh = new Person("Josh", FamilyRole.SON, false, kidsBedRoom);
        Person steez = new Person("Steez", FamilyRole.SON, false, livingRoom);
        Sensor windSensor = new Sensor();


    }
}

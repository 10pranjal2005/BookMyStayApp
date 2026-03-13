abstract class Room {

    protected String roomType;
    protected int beds;
    protected double size;
    protected double price;

    public Room(String roomType, int beds, double size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqm");
        System.out.println("Price per night: $" + price);
    }
}


class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 20, 80);
    }
}


class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 30, 120);
    }
}


class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 50, 250);
    }
}


public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("===== Available Room Types =====");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}
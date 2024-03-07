class Transport {
    public String transportType;
    public Transport(String transportType) {
        this.transportType = transportType;
    }
    public void move(String action) {
        System.out.println(this.transportType + " " + action);
    }
}

class Car extends Transport {
    public String model;
    public Car(String transportType, String model) {
        super(transportType);
        this.model = model;
    }
    public void openDoor(int doorId) {
        System.out.println("Open the " + this.model + " door " + doorId);
    }

}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Sportcar", "Ferrari");
        car1.move("poehal");
        car1.openDoor(1);
        Car car2 = new Car("Supercar", "BMW");
        car2.move("zagloh");
        car2.openDoor(3);
    }
}

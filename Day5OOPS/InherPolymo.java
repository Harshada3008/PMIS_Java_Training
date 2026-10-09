package Day5OOPS;


class Vehicle {

    protected String registrationNumber;

    // Constructor
    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Base toll calculation
    public double calculateToll() {
        return 50.0;
    }

    // Getter method
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

// Child Class: Car
class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public double calculateToll() {
        return 50.0 + 20.0;
    }
}

// Child Class: Truck
class Truck extends Vehicle {

    private int axles;

    public Truck(String registrationNumber, int axles) {
        super(registrationNumber);
        this.axles = axles;
    }

    @Override
    public double calculateToll() {
        return 100.0 + (axles * 50.0);
    }
}

// Main Class
public class InherPolymo {

    public static void main(String[] args) {

        // Polymorphism
        Vehicle myCar = new Car("MH-04-AB-1234");
        Vehicle myTruck = new Truck("MH-43-XY-9999", 4);

        System.out.println(
            "Vehicle: " + myCar.getRegistrationNumber()
            + " | Toll Due: Rs." + myCar.calculateToll()
        );

        System.out.println(
            "Vehicle: " + myTruck.getRegistrationNumber()
            + " | Toll Due: Rs." + myTruck.calculateToll()
        );
    }
}


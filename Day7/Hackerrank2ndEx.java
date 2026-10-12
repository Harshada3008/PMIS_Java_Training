package Day7;
import java.util.Scanner;

class Vehicle {
    String model;
    int speed;

    Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void start() {
        System.out.println(model + " has started.");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println("Current speed: " + speed);
    }

    void brake(int decrement) {
        speed -= decrement;
        System.out.println("Current speed: " + speed);
    }
}

public class Hackerrank2ndEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String model = sc.next();
        int initialSpeed = sc.nextInt();
        int acceleration = sc.nextInt();
        int braking = sc.nextInt();

        Vehicle car = new Vehicle(model, initialSpeed);

        car.start();
        car.accelerate(acceleration);
        car.brake(braking);

        sc.close();
    }
}

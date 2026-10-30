package org.example;

public class Main {

    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        // Create vehicles
        Car car = new Car("C1", "Swift", 1500);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        // Add vehicles to the shop
        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        // Create customers
        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        // Rent vehicles
        shop.rent(bike, asha, 8);
        shop.rent(truck, ravi, 2);

        // Try to rent the same bike again
        try {
            shop.rent(bike, ravi, 3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Return the bike
        shop.giveBack(bike);

        // Display available vehicles
        shop.showAvailable();
    }
}



package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalShop {

    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rent(Vehicle vehicle, Customer customer, int days) {

        if (!fleet.contains(vehicle)) {
            throw new IllegalArgumentException(
                    "Vehicle not found in rental shop");
        }

        if (!vehicle.isAvailable()) {
            throw new IllegalStateException(
                    vehicle.getVehicleName() + " is already rented");
        }

        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be greater than zero");
        }

        Rental rental = new Rental(vehicle, customer, days);

        vehicle.setAvailable(false);
        customer.addRental(rental);

        System.out.printf(
                "%s rented %s for %d days = %.2f%n",
                customer.getName(),
                vehicle.getVehicleName(),
                days,
                rental.getTotalRent());
    }

    public void giveBack(Vehicle vehicle) {

        if (!fleet.contains(vehicle)) {
            throw new IllegalArgumentException(
                    "Vehicle not found in rental shop");
        }

        if (vehicle.isAvailable()) {
            throw new IllegalStateException(
                    vehicle.getVehicleName() + " is not currently rented");
        }

        vehicle.setAvailable(true);
    }

    public void showAvailable() {

        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle.getVehicleName());
            }
        }
    }
}



import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

class Time {
    public static void main(String[] args) {

        // Get current date, time, and time zone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current date and time: " + now);

        // Display all available time zones
        Set<String> availableZones = ZoneId.getAvailableZoneIds();

        System.out.println("\nAvailable time zones:");
        availableZones.forEach(System.out::println);
    }
}

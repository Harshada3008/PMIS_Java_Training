
import java.time.LocalTime;

class Date {
    public static void main(String[] args) {

        // Get current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // Create a custom time
        LocalTime customTime = LocalTime.of(11, 32, 45);
        System.out.println("Custom time: " + customTime);

        // Parse time from a string
        LocalTime par = LocalTime.parse("15:30:45");
        System.out.println("Parsed time: " + par);
    }
}


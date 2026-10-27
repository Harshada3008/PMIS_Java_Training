
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

class date1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Zone ID (e.g., Asia/Kolkata): ");
        String zoneName = sc.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneName);

            ZonedDateTime now = ZonedDateTime.now(zone);

            System.out.println("Zone ID: " + zone);
            System.out.println("Date and Time: " + now);

        } catch (Exception e) {
            System.out.println("Invalid Zone ID! Please enter a valid zone.");
        }

        sc.close();
    }
}

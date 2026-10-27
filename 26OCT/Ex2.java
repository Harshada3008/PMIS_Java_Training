
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

        System.out.println("========== MEETING TIME ASSISTANT ==========");

        System.out.print("Enter meeting date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Enter meeting time (HH:mm): ");
        LocalTime time = LocalTime.parse(sc.nextLine());

        System.out.print("Enter meeting duration in minutes: ");
        long duration = Long.parseLong(sc.nextLine());

        LocalDateTime meetingStart = LocalDateTime.of(date, time);
        LocalDateTime meetingEnd = meetingStart.plusMinutes(duration);

        int choice;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display meeting date and time");
            System.out.println("2. Display meeting end time");
            System.out.println("3. Display meeting time in another zone");
            System.out.println("4. Check whether the meeting is in the future");
            System.out.println("5. Exit");
            System.out.print("\nEnter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Meeting date and time: "
                            + meetingStart.format(formatter));
                    break;

                case 2:
                    System.out.println("Meeting starts at: "
                            + meetingStart.format(formatter));
                    System.out.println("Meeting ends at:   "
                            + meetingEnd.format(formatter));
                    break;

                case 3:
                    System.out.print("Enter source zone ID (e.g., Asia/Kolkata): ");
                    String sourceZone = sc.nextLine();

                    System.out.print("Enter target zone ID (e.g., Europe/London): ");
                    String targetZone = sc.nextLine();

                    try {
                        ZonedDateTime sourceMeeting =
                                meetingStart.atZone(ZoneId.of(sourceZone));

                        ZonedDateTime convertedMeeting =
                                sourceMeeting.withZoneSameInstant(
                                        ZoneId.of(targetZone));

                        System.out.println("Meeting in " + sourceZone + ": "
                                + sourceMeeting.format(formatter)
                                + " " + sourceMeeting.getOffset());

                        System.out.println("Meeting in " + targetZone + ": "
                                + convertedMeeting.format(formatter)
                                + " " + convertedMeeting.getOffset());

                    } catch (Exception e) {
                        System.out.println("Invalid time zone ID.");
                    }
                    break;

                case 4:
                    ZonedDateTime meetingWithZone =
                            meetingStart.atZone(ZoneId.systemDefault());

                    if (meetingWithZone.isAfter(ZonedDateTime.now())) {
                        System.out.println("The meeting is in the future.");
                    } else {
                        System.out.println("The meeting is not in the future.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Meeting Time Assistant!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}

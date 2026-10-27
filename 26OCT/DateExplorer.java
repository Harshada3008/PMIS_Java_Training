
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DateExplorer {

    private LocalDate date;

    public DateExplorer(LocalDate date) {
        this.date = date;
    }

    // Display month
    public void displayMonth() {
        Month month = date.getMonth();
        System.out.println("Month: " + month);
    }

    // Display year
    public void displayYear() {
        int year = date.getYear();
        System.out.println("Year: " + year);
    }

    // Display day of week
    public void displayDayOfWeek() {
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of week: " + day);
    }

    // Check leap year
    public void checkLeapYear() {
        int year = date.getYear();

        if (date.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Look back by specified months
    public void lookBackMonths(int months) {
        LocalDate pastDate = date.minusMonths(months);
        System.out.println(months + " months before: " + pastDate);
    }

    // Display menu
    public void displayMenu() {
        System.out.println("\n===== Date Explorer =====");
        System.out.println("1. Display Month");
        System.out.println("2. Display Year");
        System.out.println("3. Display Day of Week");
        System.out.println("4. Check Leap Year");
        System.out.println("5. Look Back by Months");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        try {
            LocalDate enteredDate = LocalDate.parse(input);
            DateExplorer explorer = new DateExplorer(enteredDate);

            int choice;

            do {
                explorer.displayMenu();
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        explorer.displayMonth();
                        break;

                    case 2:
                        explorer.displayYear();
                        break;

                    case 3:
                        explorer.displayDayOfWeek();
                        break;

                    case 4:
                        explorer.checkLeapYear();
                        break;

                    case 5:
                        System.out.print("Enter number of months: ");
                        int months = sc.nextInt();

                        if (months >= 0) {
                            explorer.lookBackMonths(months);
                        } else {
                            System.out.println("Please enter a non-negative number.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting Date Explorer. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 6);

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        sc.close();
    }
}


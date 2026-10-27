import java.time.LocalDate;
import java.time.Month;

class dataTime {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate customDate = LocalDate.of(2026, 12, 31);
        System.out.println(customDate);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println("Day: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}

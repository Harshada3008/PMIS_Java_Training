import java.time.LocalDate;
public class DateTime {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();

        System.out.println(now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("\nYesterday was:" +yesterday);

        LocalDate pastDate = now.minusMonths(100);

        System.out.println("100 Months before was:" +pastDate);
    }
}

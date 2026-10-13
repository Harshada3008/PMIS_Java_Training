package Day8;
import java.util.ArrayList;
import java.util.List;

public class OddArrayList{
    public static void main(String[] args) {

        // Create a list of Integer objects
        List<Integer> numbers = new ArrayList<>();

        // Autoboxing: int to Integer
        numbers.add(12);
        numbers.add(7);
        numbers.add(23);
        numbers.add(44);
        numbers.add(91);
        numbers.add(50);

        // Store even numbers
        List<Integer> evens = new ArrayList<>();

        for (Integer num : numbers) {
            // Unboxing: Integer to int
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        System.out.println("Even numbers: " + evens);
    }
}


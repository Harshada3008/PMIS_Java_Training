package Day10;


class Util {

    // Generic method to print a value twice
    static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    // Generic method to return the second value
    static <T> T firstOf(T a, T b) {
        return b;
    }
}

public class Ex1 {

    public static void main(String[] args) {

        // Print 100 twice
        Util.printTwice(100);

        // Return and print the second value
        System.out.println(Util.firstOf("Hi", "Hello"));
    }
}


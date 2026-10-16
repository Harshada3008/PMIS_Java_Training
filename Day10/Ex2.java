package Day10;


class Locker<T> {
    private T item;

    // Store an item in the locker
    void put(T item) {
        this.item = item;
    }

    // Retrieve the stored item
    T get() {
        return item;
    }
}

public class Ex2 {
    public static void main(String[] args) {

        // Locker for String values
        Locker<String> l1 = new Locker<>();
        l1.put("C++ book");

        System.out.println("The locker has: " + l1.get());

        // Locker for Integer values
        Locker<Integer> intlocker = new Locker<>();
        intlocker.put(1234);
        intlocker.put(8910);

        System.out.println("Intlocker has: " + intlocker.get());
    }
}

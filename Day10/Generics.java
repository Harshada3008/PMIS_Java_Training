package Day10;


/* 
public class Generics<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class gen {
    public static void main(String[] args) {
        Generics<String> box = new Generics<>();
        box.set("hello");
        String s = box.get();
        System.out.println(s);
    }
}
*/

/* 1. compile time errors detected. Without generics we can detect compile time error, the code will break while executing(runtime)
2. No Manual Casting
3. reusable code.(One box class work for any type)

Rules:
1. Mentions the wrapper class.
2. Java automatically perform unboxing and autoboxing.*/


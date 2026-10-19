/*
No parameters: () -> sout("Hi")
One parameter: x -> x*2
two parameters: (a,b) -> a+b;
(int a , int b) -> a+b
*/

/*
Built in Function interfaces

//predicate<T> test(t)T -> t/f 1/0
//Function<T,R> : applu(t); T ->R
//consumer<T> : T > "Hello, "hi" .accept()
//supplier<T>
*/

import java .util.*;
import java.util.function.Consumer;
import java.util.function.Function; // this is imp while writing function
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Greeter{
    void greet(String name);
}

public class Lambda{
    public static void main(String[] args) {

        // Greeter g = name -> {System.out.println("Hello, " + name);
        // System.out.println("Welcome back");
        // System.out.println("Have a great day");};
        // g.greet("Tanisha");



         //predicate<T> test(t)T -> t/f 1/0
        // Predicate<Integer> isAdult = age -> age >= 18;
        // System.out.println(isAdult.test(15));
        // System.out.println(isAdult.test(20));


        //Function<T,R> : applu(t); T ->R
        // Function<String, Integer> getLength = name -> name.length();
        // Function<Integer, Integer> square = n -> n*n;  //squaring
        // System.out.println(getLength.apply("java"));
        // System.out.println(getLength.apply("Tanisha "));
        // System.out.println(square.apply(10));


        //consumer<T> : 
        // T > "Hello, "hi" .accept()
        // Consumer<String> pr = message -> System.out.println(message);
        // pr.accept("Hello Tanisha");
        // pr.accept("Java is easy");

        // Supplier<String> message = () -> "Welcome to the world";
        // System.out.println(message.get());

        // Consumer<String> smsNotifier = mobNo -> {
        //     System.out.println("Sending the otp to the phn no: " + mobNo);};

        //     smsNotifier.accept("+91 8691838091");
        

        //Supplier////
        Supplier<String> otpGen = () -> {
            Random random = new Random();
            int number = 100000 + random.nextInt(90000);
            return String.valueOf(number);
        };
           String userOtp = otpGen.get();
           System.out.println("The otp is "+ userOtp);

        }
    }    

    
    

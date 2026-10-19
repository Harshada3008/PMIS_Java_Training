/*no parameter
one parameter: x -> x*2
two parameter:(a,b) -> a + b ;
(int a, int b) -> a + b
 */
/*Built in function interfaces
1.predicate<T> test(t) T -> t/f 1/0 
2. Function <T,R> : apply(t) ; T -> R*/



package Day11;
/*import java.util.*;
import java.util.function.Predicate;



public class LambdaEx2 {
    public static void main(String[]args){
        Predicate<Integer> isAdult = age -> age>=18;

        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(15));
    }
    
}*/

/*import java.util.function.*;
class LambdaEx2{
    public static void main(String[]args){
        Function<String,Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Java"));
         System.out.println(getLength.apply("John"));



    }

}*/

import java.util.Scanner;
import java.util.function.Function;

class LambdaEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Function<Integer, Integer> square = num -> num * num;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square = " + square.apply(n));

        sc.close();
    }
}
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamLamda {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,5);

        //Normal loop////
        List<Integer> result = new ArrayList<>();

        for (int n: nums){
            if(n % 2 == 0){
                result.add(n*n);
            }
        }
        System.out.println(result);


        ////Stream+Lamda//////
        List<Integer> res = nums.stream()
        .filter(n -> n%2 == 0)
        .map(n -> n*n)
        .collect(Collectors.toList());

        System.out.println("OG List: "+ nums);
        System.out.println("Result: "+ res);

        ///////////
        // List<String> list = List.of("a", "b", "c");
        // System.out.println("Stream from a list: ");
        // list.stream().forEach(System.out::println);

        // int[] arr = {1,2,3};
        // Arrays.stream(arr).forEach(System.out::println);

        // Stream.of("x","y","z").forEach(System.out::println);

        // IntStream.range(1,5).forEach(System.out::println);

        ///////////////////////
        // List<Integer> number = List.of(5,12,8,3,20,7);
        // List<Integer> result1 =  number.stream()
        // .filter(n -> n>=7)
        // .collect(Collectors.toList());
        // System.out.println(result1);


    


    }

    }

/*
Source(where the data comes from) [my_list.stream()]
->Intermediate operations(transform/filter) {.filter(), .map()..}
-> Terminal operation(produce the final result)[.collect(), .count()]
*/
import java.util.*;
import java.util.stream.Collectors;
public class Maps {
    public static void main(String[] args) {
        //map : transform each item.

        List<Integer> nums = List.of(5,12,8,3,4,5);
        List<String> words = List.of("Banana", "fig", "apple", "kiwi");
        List<String> byLength = words.stream()
        .sorted((a,b) -> a.length() - b.length())
        .collect(Collectors.toList());

        List<Integer> res = nums.stream()
        .map(n -> n*2)
       // .sorted()
        .collect(Collectors.toList());
        


        System.out.println(res);
        System.out.println(byLength);


    }
}

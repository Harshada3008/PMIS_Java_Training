/*Find the Second-
Largest Distinct
Number
Problem Statement
You are given an array of integers. Your task
is to find the second-largest distinct
element in the array
The second-largest element must be strictly smaller than the largest element. Repeated occurrences of the largest number must not be considered the second-largest element.
If the array does not contain at least two
distinct elements, print Not Possible.
Input Format
.The first line contains an integer N, 
representing the numiber of elements in the array.
•The second line contains N space-separated integers.
Constraints
9 2uNu100O
Language Java8
import java
5
14
15
16
17
18
19
。-10000.s'each array element s 10000
occurrences of the largest number must not be considered the second-largest element.
If the array does not contain at least two distinct elements, print Not Possible.
Input Format
•The first line contains an integer N, 
representing the number of elements in the array.
•The second line contains N space-
separated integers.
Constraints
•2sNs1000
Output Format
Print the second-largest distinct element. If
no such element exists, print Not Possible.
Sample Input
6
1020520815
Sample Output
15
Explanation
The largest element is 20. The next-largest distinct element is 15, so the output is 15.
. 110OOO S each array element u 10000 */
package Day6;
import java.io.*;
import java.util.*;

class Result {
    public static int secondLargest(int n, List<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = arr.get(i);

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }
}

public class HackerRank2nd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());

        String[] input = br.readLine().trim().split("\\s+");
        List<Integer> arr = new ArrayList<>();

        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }

        int result = Result.secondLargest(n, arr);
        System.out.println(result);

        br.close();
    }
}




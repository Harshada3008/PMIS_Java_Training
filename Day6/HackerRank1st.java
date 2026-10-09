/*Problem Statement
A number is called a Special Number if the
sum of the factorials of its digits is equal to
the original number.
For example, the number 145 is a Special Number because:
·1=1
·4!=24
·5!=120
· Sum =1+24+120= 145
Your task is to determine whether a given positive integer is a Special Number.
Input Format
A single positive integer N.
Constraints
1sNs1,000, 000Output Format
Print Special Number if the given number satisfies the condition, Ótherwise, print Not a Special Number.
Sample Input 0
145
5! =120
·Sum =1+24 +120=145
Your task is to determine whether a given
positive integer is a Special Number,
Input Format
A single positive integer N.
Constraints
1s Ns1,000, 000
Output Format
Print Special Number if the given number satisfies the condition, Otherwise, print Not a Special Number.
Sample Input 0
145
Sample Output 0
Special Number
Sample Input 1
123
Sample Output 1
Not a Special Number
Explanation
For 123, the sum of the factorials of its digits is;
1!+2!+3!=1+2+6=9
Since 9 is not equal to 123, the number is not a Special Number.
*/

package Day6;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'isSpecialNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The f
     unction accepts INTEGER n as parameter.
     */

    
public static int isSpecialNumber(int n) {
    int original = n;
    int sum = 0;

    while (n > 0) {
        int digit = n % 10;
        int factorial = 1;

        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }

        sum += factorial;
        n /= 10;
    }

    return (sum == original) ? 1 : 0;
}


}

public class HackerRank1st {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.isSpecialNumber(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}





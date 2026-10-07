/*3. Write a function which takes in 2 numbers and returns the greater of those two.  */
import java.util.*;
public class ExQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = findGreater(a, b);
        System.out.println("Greater = " + greater);
    }

    public static int findGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}   


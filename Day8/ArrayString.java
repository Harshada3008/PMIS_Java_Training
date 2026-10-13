/*problem 1: sum and average of array elements problem statement take n integers as input 
from the user, store them in an array, and find the sum and average of all the elements.  */


package Day8;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}

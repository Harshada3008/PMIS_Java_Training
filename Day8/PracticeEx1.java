/*Problem Statement:

Write a program that takes two integer inputs from the user and calculates their division. 
If the second number is zero, handle the resulting ArithmeticException gracefully and 
print an error message instead of crashing. */



package Day8;
import java.util.Scanner;

public class PracticeEx1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");  
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    
}

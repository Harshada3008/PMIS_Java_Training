package Day8;
import java.util.*;
class Throw {
    public static void main(String[]args){
        System.out.print("enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age: "+age);

    }
    
}

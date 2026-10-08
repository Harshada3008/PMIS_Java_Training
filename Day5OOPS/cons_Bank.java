package Day5OOPS;

class bank {
    String name;
    int acc_no;
    int balance;

    // Constructor
    bank(String name, int acc_no, int balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    // Method 1
    void displayInfo() {
        System.out.println(name + "\n" + acc_no + "\n" + balance);
    }

    // Method 2
    void deposit(int amount) {
        int or_balance = balance;
        balance += amount;

        System.out.println("Original Balance: " + or_balance);
        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }
    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            int or_balance = balance;
            balance -= amount;

            System.out.println("Original Balance: " + or_balance);
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}

public class cons_Bank {
    public static void main(String[] args) {

        bank b1 = new bank("Pooja Jesu", 45285167, 10000);

        b1.displayInfo();
        b1.deposit(500);
        b1.withdraw(2000);
    }
}

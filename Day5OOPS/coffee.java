package Day5OOPS;

class wallet {
    String name;
    double balance;

    // Constructor
    wallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Add funds
    void addfunds(double amount) {
        balance += amount;
        System.out.println("Added ₹" + amount + " to wallet. New balance: ₹" + balance);
    }

    // Purchase
    void purchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Purchase successful!");
            System.out.println("Amount spent: ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Account overview
    void displayOverview() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class coffee {
    public static void main(String[] args) {

        // Opening wallet with ₹500
        wallet wallet = new wallet("Anish", 500);

        // Account overview
        wallet.displayOverview();

        // Top up with ₹200
        wallet.addfunds(200);

        // Buy ₹150 snack
        wallet.purchase(150);

        // Attempt to buy ₹800 item
        wallet.purchase(800);

        // Final overview
        wallet.displayOverview();
    }
}
    


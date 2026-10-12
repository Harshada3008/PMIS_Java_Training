package Day7;


class UserAccount {

    // Instance variable
    private String username;

    // Static variable shared by all objects
    private static int totalUsers = 0;

    // Parameterized constructor
    UserAccount(String username) {
        this.username = username;
        totalUsers++;
    }

    // Getter method
    public String getUsername() {
        return username;
    }

    // Static method
    public static int getTotalUsers() {
        return totalUsers;
    }
}

public class StaticDemo1 {

    public static void main(String[] args) {

        // Display initial count
        System.out.println("Initial User Count: "
                + UserAccount.getTotalUsers());

        // Create three user objects
        UserAccount user1 = new UserAccount("Harshada");
        UserAccount user2 = new UserAccount("Pooja");
        UserAccount user3 = new UserAccount("Sonali");

        // Display usernames
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Username: " + user2.getUsername());
        System.out.println("Username: " + user3.getUsername());

        // Display total users using the class name
        System.out.println("Total Registered Users: "
                + UserAccount.getTotalUsers());
    }
}


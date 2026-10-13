package Day8;


class TryCatchFinally {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawal = 6000.0;

        try {
            if (withdrawal > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            balance -= withdrawal;

            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount: " + withdrawal);
            System.out.println("Remaining Balance: " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

package Day8;

class Finally {
    public static void main(String[] args) {
        try {
            int res = 10/5;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block is always executed.");
        }
       
    }
    }

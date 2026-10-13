package Day8;
class TryCatch {
    public static void main(String[]args){
        try{
            
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
            int rest = 10/0;
            System.out.println("Result: "+rest);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } 
            catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    
}

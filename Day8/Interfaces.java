package Day8;

/*String Sum */

public class Interfaces { 
         public static void main(String[] args) { 
            String input = "10,25,40,15,60";
              String[] parts = input.split(",");        
              int total = 0;        
              for (String part : parts) { 
                  // Convert String to primitive int using wrapper method 9.   
                            total += Integer.parseInt(part); 
                        } 
            System.out.println("Total sum: " + total); 
     } 
 } 

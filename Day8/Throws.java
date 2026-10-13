package Day8;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;

class Throws {
    static void readFile()throws IOException {
        FileReader file = new FileReader("nonexistentfile.txt");
        System.out.println("File Oprned");

      
    }
    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Exception handled: "+e.getMessage());
        }
    }
    
}

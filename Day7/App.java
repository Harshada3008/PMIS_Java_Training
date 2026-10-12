package Day7;

/*public class App {
    public static void main(String[] args) {
        car c = new car();
        c.drive();
    }
    
}*/
/* 2. 
public class App {
    public static void main(String[] args) {
        Address a = new Address("New York", "NY", 10001);
        student s = new student("John Doe", 12345, a);
        s.displayDetails();
    
}
        */

public class App{
    public static void main (String[]args){
       Battery phbattery = new Battery(1000);
       Camera phcamera = new Camera(12);
       phone ph = new phone("Samsung", phbattery, phcamera);
       ph.snappictures();
    }
}

package Day7;


/*class Engine{
    void start(){
        System.out.println("Engine started");   
    }
}

class car{
    private Engine engine;
    car(){
        this.engine = new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}*/
/*2. 
class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    void displayAddress(){
        System.out.println(city +"," +state+"," +pincode);

    }

}
class student{
    
    String name;
    int rollno;
    Address address;

    student(String name, int rollno, Address address){
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }
    void displayDetails(){
        System.out.println("Student: " +name+ "\nRoll No" +rollno);
        System.out.println("Lives At: ");
        address.displayAddress();
    }
}

 */

class Battery{
    int capacity;
    Battery(int capacity){
        this.capacity = capacity;
    }
    void drain(){
        System.out.print("Battery drained by " +capacity+ "mAh");
    }
}
class Camera{
    int pix;
    Camera(int pix){
        this.pix = pix;
    }
    void takephoto(){
        System.out.print("Photo taken with " +pix+ "MP camera");
    }
}
class phone{
    String brand;
    Battery battery;
    Camera camera;
    phone(String brand, Battery battery, Camera camera){
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }
    void snappictures(){
        System.out.println( "["  +brand+  "]" + "is active");
        camera.takephoto();
        battery.drain();
    }
}
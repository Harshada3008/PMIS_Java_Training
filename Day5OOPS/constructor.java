package Day5OOPS;
class car{
    String color;
    String Brand;
    int Speed;

    car(String color, String Brand, int Speed)
    {
        this.color = color;
        this.Brand = Brand;
        this.Speed = Speed;
    }
// method 1
    void displayInfo()
    {
        System.out.println(Brand+"\n"+color+ "\n" + Speed);
        
}
//method 2
void accelerate(int increment)
{
    int or_Speed = Speed;
    Speed += increment;
    System.out.println("Original Speed: " + or_Speed);
    System.out.println("Accelerated Speed: " + Speed + " km/h");
}
}

public class constructor {
    public static void main(String[] args) {
      car c1 = new car("Black", "Toyota", 360);
        c1.displayInfo();
        c1.accelerate(30);
    }
    
}

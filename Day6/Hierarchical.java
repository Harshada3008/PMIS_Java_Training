package Day6;
class shape{
    String color = "Red";

}
class circle extends shape{
    void drawCircle(){
        System.out.println("Drawing a "+color+" circle");

    }
}
class rectangle extends shape{
    void drawRectangle(){
        System.out.println("Drawing a "+color+" rectangle");
    }
}


public class Hierarchical {
    public static void main(String[] args){
        circle c = new circle();
        rectangle r = new rectangle();
        c.drawCircle();
        r.drawRectangle();

    }
    
    
}

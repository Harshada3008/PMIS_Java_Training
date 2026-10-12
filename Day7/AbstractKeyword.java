package Day7;


abstract class Shape {

    private String colour;

    void setColor(String colour) {
        this.colour = colour;
    }

    String getColor() {
        return colour;
    }

    // Abstract method: no body
    abstract double calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class AbstractKeyword {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.setColor("Red");

        System.out.println("Circle Color: " + c.getColor());
        System.out.println("Circle Area: " + c.calculateArea());

        System.out.println();

        Rectangle r = new Rectangle(10, 5);
        r.setColor("Blue");

        System.out.println("Rectangle Color: " + r.getColor());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}





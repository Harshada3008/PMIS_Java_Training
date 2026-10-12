

package Day7;

import java.util.Scanner;

abstract class Shape {
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class HackerRank1stEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.setColor("Orange");

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.setColor("Light Blue");

        System.out.printf("Circle Color: %s%n", circle.getColor());
        System.out.printf("Circle Area: %.2f%n",
                circle.calculateArea());

        System.out.printf("Rectangle Color: %s%n", rectangle.getColor());
        System.out.printf("Rectangle Area: %.2f%n",
                rectangle.calculateArea());

        sc.close();
    }
}

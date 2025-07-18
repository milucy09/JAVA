package Tasks;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius){
        super(color, 0,0);
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {

    Rectangle(String color, double length, double width){
        super(color, length, width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}

public class Task15{
    public static void main(String[] args) {
         Circle circle = new Circle("Red", 5);
         Rectangle rectangle = new Rectangle("Blue", 4, 6);

         System.out.println("Circle:");
         System.out.println("Color: " + circle.color);
         System.out.println("Area: " + circle.calculateArea());
         System.out.println("Perimeter: " + circle.calculatePerimeter());

         System.out.println("\nRectangle:");
         System.out.println("Color: " + rectangle.color);
         System.out.println("Area: " + rectangle.calculateArea());
         System.out.println("Perimeter: " + rectangle.calculatePerimeter());
         
    }
}

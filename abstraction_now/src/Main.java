// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double area();
}

// Interface
interface Drawable {
    void draw();
}

// Concrete class implementing the Shape abstract class and Drawable interface
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Concrete class implementing the Shape abstract class and Drawable interface
class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());

        circle.draw();
        rectangle.draw();
    }
}

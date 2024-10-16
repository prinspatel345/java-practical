interface Shape {
    String getColor();

    default void display() {
        System.out.println("Displaying shape with color: " + getColor());
    }
}

interface Drawable {
    void draw();
}

class Circle implements Shape, Drawable {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }
}

class Rectangle implements Shape, Drawable {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + " and color " + color);
    }
}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        shape.display();
        System.out.println("Sign text: " + text);
    }
}

public class practical23 {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0, "Red");
        Shape rectangle = new Rectangle(10.0, 6.0, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Park!");
        Sign rectangleSign = new Sign(rectangle, "Campus Center");

        System.out.println("Circle Sign:");
        circleSign.display();

        System.out.println("\nRectangle Sign:");
        rectangleSign.display();
    }
}
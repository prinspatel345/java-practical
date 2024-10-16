class Shape {
    public void method() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void method() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    @Override
    public void method() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    @Override
    public void method() {
        System.out.println("Square is a rectangle");
    }
}

public class practical20 {
    public static void main(String[] args) {
        // Create an object of Square
        Square square = new Square();
        
        // Call the method of Square class
        square.method(); // This will print "Square is a rectangle"
        
        // To call the method from Rectangle or Shape, you can use casting
        ((Shape) square).method(); // This will print "This is rectangular shape"
        ((Rectangle) square).method(); // This will print "This is rectangular shape"
    }
}
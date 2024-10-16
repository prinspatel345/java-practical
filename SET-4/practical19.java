import java.util.Scanner;
class Rectangle{
    public int length,breadth;

    public Rectangle(int b,int d)
    {
        length = b;
        breadth =d;
    }
    public int area()
    {
        int a;
        a = length*breadth;
        return a;
    }
    public int perimeter()
    {
        int p;
        p = 2 * length * breadth;
        return p;
    }
}

class Square extends Rectangle
{
    public Square(int length,int breadth)
    {
        super(length,breadth);
    }
}

public class practical19
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i;
        Rectangle[] rectangles = new Rectangle[2];
        Square[] squares = new Square[2];

        for (i = 0; i < 2; i++) {
            System.out.println("Enter the value of rectangle " + (i + 1));
            System.out.print("Enter the length of Rectangle: ");
            int len = s.nextInt();
            System.out.print("Enter the breadth of Rectangle: ");
            int bre = s.nextInt();
            rectangles[i] = new Rectangle(len, bre);

            int resulta = rectangles[i].area();
            System.out.println("Area of Rectangle: " + resulta);
            int resultp = rectangles[i].perimeter();
            System.out.println("Perimeter of Rectangle: " + resultp);
            System.out.println();

            System.out.print("Enter the side of Square: ");
            int side = s.nextInt();
            squares[i] = new Square(side,side);

            resulta = squares[i].area();
            System.out.println("Area of Square: " + resulta);
            resultp = squares[i].perimeter();
            System.out.println("Perimeter of Square: " + resultp);
    
        }
    }
}


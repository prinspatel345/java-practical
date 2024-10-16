import java.util.Scanner;

class complex
{
    int r,i;
    Scanner s=new Scanner(System.in);

    void getvalue()
    {
        System.out.println("Enter Real Part ");
        r=s.nextInt();
        System.out.println("Enter Imaginary Part ");
        i=s.nextInt();
    }

    void add(complex cx)
    {
        int sumr=r+cx.r;
        int sumi=i+cx.i;

        System.out.println("Sum :" + sumr + "+" + sumi + "i");
    }

    void sub(complex cx)
    {
        int sumr=r-cx.r;
        int sumi=i-cx.i;

        System.out.println("Subtraction :" + sumr + "+" + sumi + "i");
    }

    void mul(complex cx)
    {
        int sumr=(r*cx.r)-(i*cx.i);
        int sumi=(r*cx.r)+(i*cx.i);

        System.out.println("multiplication :" + sumr + "+" + sumi + "i");
    }
}

public class practical16 {
    public static void main(String[] args) {

        complex c1=new complex();
        complex c2=new complex();

        c1.getvalue();
        c2.getvalue();
        c1.add(c2);
        c1.sub(c2);
        c1.mul(c2);
        
        
    }    
}

class degree
{
    void getdegree()
    {
        System.out.println("i get a degree");
    }
}

class undergraduate extends degree
{
    void getdegree()
    {
        System.out.println("i am an undergraduate");
    }
}

class postgraduate extends degree
{
    void getdegree()
    {
        System.out.println("i am an postgraduate");
    }
}
public class practical21 {
    public static void main(String[] args)
    {
        degree d = new degree();
        d.getdegree();
        undergraduate u = new undergraduate();
        u.getdegree();
        postgraduate p = new postgraduate();
        p.getdegree();
    }
    
}

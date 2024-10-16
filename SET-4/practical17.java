class parent
{
    public void method()
    {
        System.out.println("this is parent class");
    }
}
class child 
{
    public void method()
    {
        System.out.println("this is child class");
    }
}

class practical17
{
    public static void main(String[] args)
    {
        parent p = new parent();
        child c = new child();
        p.method();
    }
}
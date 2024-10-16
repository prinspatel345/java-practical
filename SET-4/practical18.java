
class Member
{
    public String name,address;
    public int age,salary;
    public long phonenum;

    public void printsalary()
    {
        System.out.println("salary: "+salary);
    }
}

class Employee extends Member
{
    String specialization,department;
    public Employee()
    {
 
    this.name = "Ravi";
    this.age = 18;
    this.phonenum = 9876558679L;
    this.address = "charusat university";
    this.salary = 85000;
    specialization = "python";
    department = "depstar";
    }
    public void detail()
    {
    System.out.println("Employee detail");
    System.out.println("name: "+this.name);
    System.out.println("age: "+this.age);
    System.out.println("phone number: "+this.phonenum);
    System.out.println("address: "+this.address);
    
    this.printsalary();
    System.out.println("specialization: "+specialization);
    System.out.println("department: "+department);
    }
}

class Manager extends Member
{
    String specialization,department;

    public Manager()
    {
    this.name = "ajay";
    this.age = 21;
    this.phonenum = 7894587592L;
    this.address = "charusat university";
    this.salary = 87000;
    specialization = "designing";
    department = "depstar";
    }

    public void detail()
    {
    System.out.println("Employee detail");
    System.out.println("name: "+this.name);
    System.out.println("age: "+this.age);
    System.out.println("phone number: "+this.phonenum);
    System.out.println("address: "+this.address);
    // System.out.println("salary: "+salary);
    this.printsalary();
    System.out.println("specialization: "+specialization);
    System.out.println("department: "+department);
    }
}

class practical18
{
    public static void main(String[] args)
    {
        Member m = new Member();
        Employee e1 = new Employee();
        e1.detail();
        Manager m1 = new Manager();
        m1.detail();

    }
}
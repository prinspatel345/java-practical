class Date
{
private int month;
private int day;
private int year;

public Date(int a,int b,int c)
{
    month = a;
    day = b;
    year = c;
}

public void setmonth(int a)
{
    month = a;
}
public int getmonth()
{
    return month;
}

public void setday(int b)
{
    day = b;
}
public int getday()
{
    return day;
}

public void setyear(int c)
{
    year = c;
}
public int getyear()
{
    return year;
}

public void displayDate()
{
    System.out.println("Date: "+month+"/"+day+"/"+year);
}
}

class practical14{
public static void main(String[] args)
{
    Date d1 = new Date(7,30,2024);
    Date d2 = new Date(1,26,1949);

    System.out.print("Date 1: ");
    d1.displayDate();

    System.out.print("Date 2: ");
    d2.displayDate();

    d1.setmonth(1);
    d1.setday(1);
    d1.setyear(2021);

    System.out.print("Modified Date 1: ");
    d1.displayDate();
  
    d2.setmonth(10);
    d2.setday(31);
    d2.setyear(2023);

    System.out.print("Modified Date 2: ");
    d2.displayDate();
}
}
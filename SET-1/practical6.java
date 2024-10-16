import java.util.Scanner;
public class practical6
{

public static void main(String[] args)
{

System.out.print("enter number of days that you want to exercise: ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int first = 0,second = 1,next;

for(int i = 0;i<n;i++)
{
System.out.println(i+" day hours of exercise is "+first);
next =  first+second;
first = second;
second = next;
}
}
}
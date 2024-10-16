import java.util.Scanner;
public class practical3
{
	
	public static void main(String[] args)
{
	System.out.print("enter the distance covered in meters: ");
	Scanner s = new Scanner(System.in);
	float a = s.nextFloat();
	System.out.print("time taken for this distance in seconds: ");
	float b = s.nextFloat();
	float c = (a/1000)/(b/60/60);
	System.out.println(c);
	float d = (a/1609)/(b/60/60);
	System.out.println(d);
}}
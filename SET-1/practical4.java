import java.util.Scanner;
public class practical4
{
public static void main(String[] args)
{
System.out.println("enter daily expenses:");
Scanner s = new Scanner(System.in);
int a=5;
float[] b = new float[a];
float sum = 0;
int i;
for(i=0;i<a;i++)
{
b[i] = s.nextFloat();
sum+=b[i];
}
System.out.println(sum);
}}



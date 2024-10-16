import java.util.*;
class practical5
{
	public static void main(String args[])
{
System.out.println("we have the list of product is ");
System.out.println("1.motor  2.fan  3.tube  4.wires  5.all other items.");
System.out.println("enter number which costumer want to buy");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
float taxprice;
float[] b = new float[5];
float[] c = new float[5];
System.out.print("price of product: ");
float p = s.nextFloat();

switch(a)
{
case 1:
	System.out.println("            Bill");
	System.out.println("code of motor is : 1");
	taxprice = p+=p*0.08f;
	System.out.print("price of motor including tax is : "+ taxprice);
	break;
case 2:
	System.out.println("            Bill");
	System.out.println("code of fan is : 2");
	taxprice = p+=p*0.12f;
	System.out.print("price of fan including tax is : "+ taxprice);
	break;
case 3:
	System.out.println("            Bill");
	System.out.println("code of tube is : 3");
	taxprice = p+=p*0.05f;
	System.out.print("price of tube including tax is : "+ taxprice);
	break;
case 4:
	System.out.println("            Bill");
	System.out.println("code of wires is : 4");
	taxprice = p+=p*0.075f;
	System.out.print("price of wires including tax is : "+ taxprice);
	break;
case 5:
	System.out.println("            Bill");
	System.out.println("code of other items is : 5");
	taxprice = p+=p*0.03f;
	System.out.print("price of other items including tax is : "+ taxprice);
	break;
default:
	System.out.println("entered number is wrong");
	break;
}
}
}



	

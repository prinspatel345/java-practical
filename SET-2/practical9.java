import java.util.Scanner;
public class practical9
{

static void double_char(String str)
{
int length = str.length();
for(int j = 0;j<length;j++){
	char ch = str.charAt(j);
	for(int i=0;i<2;i++)
	{

	System.out.print(ch);

	}
	}
}

public static void main(String[] args)
{
System.out.print("enter a string: ");
Scanner s=new Scanner(System.in);
String str = s.nextLine();
double_char(str);
}
}

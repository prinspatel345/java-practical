import java.util.Scanner;
public class practical10 {
    public static void main(String[] args) {
        String str;
	Scanner s = new Scanner(System.in);
	str = s.nextLine();

        int length = str.length();
        System.out.println("Length of the string: " + length);

        
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase of the string: " + lowerCaseStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase of the string: " + upperCaseStr);

    
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reverseStr);
        

    }
}
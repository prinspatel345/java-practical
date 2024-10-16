public class practical11 {
    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";

       
        int length = str.length();
        System.out.println("Length of the string: " + length);

        
        char firstLetterOfYourName = 'R';
        String replacedStr = str.replace('H', firstLetterOfYourName);
        System.out.println("String after replacing 'H' with " + firstLetterOfYourName + " : " + replacedStr);

        
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase of the string: " + lowerCaseStr);

}
}
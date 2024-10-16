import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class practical29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        System.out.print("Enter the word to search: ");
        String wordToSearch = scanner.nextLine();

        int lineCount = 0;
        boolean wordFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
        
                if (line.contains(wordToSearch)) {
                    System.out.println("Word found on line " + lineCount + ": " + line);
                    wordFound = true;
                }
            }

            if (!wordFound) {
                System.out.println("The word '" + wordToSearch + "' was not found in the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
    }
}

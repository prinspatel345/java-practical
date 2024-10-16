import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical28 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCounter <filename> <character>");
            return;
        }

        String filename = args[0];
        char targetChar = args[1].charAt(0);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == targetChar) {
                        count++;
                    }
                }
            }

            System.out.println("The character '" + targetChar + "' appears " + count + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

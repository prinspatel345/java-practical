import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class practical31 {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Enter text to write to the file (type 'exit' to finish):");
            String inputLine;

            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }
            System.out.println("Data has been written to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while reading from console or writing to the file.");
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream("copy_output.txt")) {

            System.out.println("Copying data from " + fileName + " to copy_output.txt...");

            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }
            System.out.println("Data has been copied to copy_output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

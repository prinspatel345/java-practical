import java.io.IOException;
import java.sql.SQLException;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class practical26 {

    public static void riskyMethod() throws MyCustomException {
        throw new MyCustomException("User-defined exception occurred!");
    }

    public static void methodWithCheckedExceptions() throws IOException, SQLException {
        throw new IOException("This is a checked IOException.");
    }

    public static void methodWithUncheckedExceptions() {
        throw new NullPointerException("This is an unchecked NullPointerException.");
    }

    public static void main(String[] args) {

        try {
            riskyMethod();
        } catch (MyCustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }

        try {
            methodWithCheckedExceptions();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Caught an SQLException: " + e.getMessage());
        }
        
        try {
            methodWithUncheckedExceptions();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
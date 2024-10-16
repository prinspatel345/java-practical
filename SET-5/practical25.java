class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class practical25 {
    public static void riskyMethod() throws MyCustomException {
        throw new MyCustomException("Something went wrong!");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (MyCustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}
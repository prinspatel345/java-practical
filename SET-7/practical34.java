import java.util.Random;

class Randomclass extends Thread {
    public static int number;

    public void run() {
        Random rnum = new Random();
        while (true) {
            number = rnum.nextInt(100);
            System.out.println("Generated Number: " + number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("RandomNumberGenerator interrupted.");
            }
        }
    }
}

class Square extends Thread {
    public void run() {
        while (true) {
            if (Randomclass.number % 2 == 0) {
                int square = Randomclass.number * Randomclass.number;
                System.out.println("Square of " + Randomclass.number + " is: " + square);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Square interrupted.");
            }
        }
    }
}

class Cube extends Thread {
    public void run() {

        while (true) {
            if (Randomclass.number % 2 != 0) {
                int cube = Randomclass.number * Randomclass.number * Randomclass.number;
                System.out.println("Cube of " + Randomclass.number + " is: " + cube);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Cube interrupted.");
            }
        }
    }
}

public class practical34 {
    public static void main(String[] args) {
        Randomclass random = new Randomclass();
        Square square = new Square();
        Cube cube = new Cube();

        random.start();
        square.start();
        cube.start();
    }
}
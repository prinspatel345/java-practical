class First extends Thread {
    private int start, end;
    private int sum;

    public First(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

class Second extends Thread {
    private int start, end;
    private int sum;

    public Second(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class practical33 {
    public static void main(String[] args) {
        int N = 10;
        int n = 2;
        int a = N / n;

        First f = new First(1, a);
        Second s = new Second(a + 1, N);

        f.start();
        s.start();

        try {
            f.join();
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = f.getSum() + s.getSum();

        System.out.println("Sum: " + sum);
    }
}
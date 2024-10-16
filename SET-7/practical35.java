class practical35 extends Thread {
    private int value;

    public practical35(int value) {
        this.value = value;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            value++;
            System.out.println("value after increment: " + value);

        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
    }

    public static void main(String[] args) {
        practical35 thread = new practical35(5);
        thread.start();
    }
}
class practical32 extends Thread {
    public void run() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        practical32 thread = new practical32();
        thread.start();
    }
}

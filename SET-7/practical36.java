class practical36 extends Thread {
    public practical36(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        practical36 firstt = new practical36("FIRST");
        practical36 secondt = new practical36("SECOND");
        practical36 thirdt = new practical36("THIRD");

        firstt.setPriority(3);
        secondt.setPriority(Thread.NORM_PRIORITY);
        thirdt.setPriority(7);

        firstt.start();
        secondt.start();
        thirdt.start();
    }
}
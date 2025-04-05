package task3;

public class NumberThread {
    public static Object monitor = new Object();

    public static void main(String[] args) {
        Runnable r3 = new ThirdThread();
        Thread t3 = new Thread(r3);

        Runnable r2 = new SecondThread();
        Thread t2 = new Thread(() -> {
            r2.run();
            t3.start();
        });

        Runnable r1 = new FirstThread();
        Thread t1 = new Thread(() -> {
            r1.run();
            t2.start();
        });
        t1.start();
    }
}

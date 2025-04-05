package task1;

public class Messages {
    public static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new RunFirstMessage();
        Thread t1 = new Thread(r1);

        Runnable r2 = new RunSecondMessage();
        Thread t2 = new Thread(r2);

        Runnable r3 = new RunThirdMessage();
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        t3.join();

        System.out.println(" Main DONE");
    }
}



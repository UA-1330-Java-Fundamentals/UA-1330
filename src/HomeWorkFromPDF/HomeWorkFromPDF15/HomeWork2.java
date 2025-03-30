/*
Run three threads and output there different messages for 5 times. The third thread
supposed to start after finishing working of the two previous threads.
*/

package HomeWorkFromPDF.HomeWorkFromPDF15;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t1.join();

        System.out.println("Hello world!");
    }
}

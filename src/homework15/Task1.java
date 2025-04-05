package homework15;

/*
Run three threads and output there different messages for 5 times. The third thread
supposed to start after finishing working of the two previous threads.
 */
public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        var t1 = new MyThread("Message of thread 1");

        var t2 = new MyThread("Message of thread 2");

        var t3 = new MyThread("Message of thread 3");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }
}

class MyThread extends Thread {
    String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100); // Затримка 100 мілісекунд
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

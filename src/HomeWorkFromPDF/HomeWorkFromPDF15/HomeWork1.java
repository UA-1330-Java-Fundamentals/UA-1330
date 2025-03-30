/*
Run three threads and output there different messages for 5 times. The third thread
supposed to start after finishing working of the two previous threads.
*/

package HomeWorkFromPDF.HomeWorkFromPDF15;

class NewThread implements Runnable{
    String message;

    public NewThread(String message) {
        this.message = message;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new NewThread("message1"));
        Thread thread2 = new Thread(new NewThread("message2"));


        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Thread thread3 = new Thread(new NewThread("message3"));
        thread3.start();
        thread3.join();



    }
}

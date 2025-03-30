/*
Output two messages «Hello, world» and «Peace in the peace» 5 times each with the
intervals of 2 seconds, and the second - 3 seconds. After printing messages, print the
text «My name is …»
*/

package HomeWorkFromPDF.HomeWorkFromPDF15;

import java.time.Duration;

public class PracticalTask2{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread("Hello, world", 3000));
        Thread thread2 = new Thread(new MyThread("Peace in the world", 2000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("My name is Adam");

    }
}

class MyThread implements Runnable{
    String mess;
    int time;

    public MyThread(String mess, int time) {
        this.mess = mess;
        this.time = time;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(mess);

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

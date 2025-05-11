package com.softserve.edu.prTaskThreads;
//Output two messages «Hello, world» and «Peace in the peace» 5 times each with
// the intervals of 2 seconds,
// and the second - 3 seconds. After printing messages, print the text «My name is …»
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello, world", 2_000);
        var t2 = new MyThread("Peace in the peace", 3_000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Olena");
    }
}


class MyThread extends Thread {
    String message;
    int pause;

    public MyThread(String message, int pause) {
        this.message = message;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {}
            System.out.println(message);
        }
    }
}

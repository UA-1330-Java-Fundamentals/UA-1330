package com.softserve.edu.hw15Threads;
//Run three threads and output there different messages for 5 times.
// The third thread supposed to start after finishing working of the two previous threads.

public class Task1Thread {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MThread("Hello, world");
        var t2 = new MThread("Don't worry!");
        var t3 = new MThread("Be happy!");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
        t3.join();
        System.out.println("My name is Olena");
    }
}

class MThread extends Thread {
    String message;


    public MThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}

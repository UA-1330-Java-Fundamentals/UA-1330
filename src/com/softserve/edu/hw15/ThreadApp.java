package com.softserve.edu.hw15;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread("message1");
        Thread thread2 = new MyThread("message2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Thread thread3 = new MyThread("message3");
        thread3.start();

    }
}

package com.softserve.edu.hw15Threads;

public class Task2DeadLock {
    public static void main(String[] args) throws InterruptedException {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread tr1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: keeping lock1");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                System.out.println("Thread 1: waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: keeping lock1 & lock2");
                }
            }
        });

        Thread tr2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: keeping lock2");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                System.out.println("Thread 2: waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2: keeping lock2 & lock1");
                }
            }
        });

        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println("Never end");
    }
}

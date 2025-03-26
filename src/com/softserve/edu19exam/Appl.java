package com.softserve.edu19exam;

public class Appl {

    public synchronized void m1() {
        for (int i = 0; i < 100; i++) {
            System.out.print("+");
        }
    }

    public void m2() {
        synchronized (Appl.class) { // Both working
        //synchronized (this) { // One waits
            for (int i = 0; i < 100; i++) {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Appl appl = new Appl();
        Thread t1 = new Thread(() -> appl.m1());
        Thread t2 = new Thread(() -> appl.m2());
        //t1.start();
        t2.start();
        t1.start();
        //
        t1.join();
        t2.join();
        System.out.println("done");
    }
}

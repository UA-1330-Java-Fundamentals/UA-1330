package com.softserve.threads.homework;

import com.softserve.threads.Run1m;
import com.softserve.threads.Run1p;

public class ThreeThreadsAppl {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new MyThread1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new MyThread2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new MyThread3();
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}

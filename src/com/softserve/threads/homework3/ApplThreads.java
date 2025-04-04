package com.softserve.threads.homework3;

import com.softserve.threads.homework.MyThread1;
import com.softserve.threads.homework.MyThread2;
import com.softserve.threads.homework.MyThread3;

public class ApplThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new TestThread1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new TestThread2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new TestThread3();
        Thread t3 = new Thread(r3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

package com.softserve.threads.homework3;

public class TestThread1 implements Runnable{
    @Override
    public void run( ) {
        synchronized(ApplThreads.class){
            System.out.println("This is thread #1");
        }

    }
}

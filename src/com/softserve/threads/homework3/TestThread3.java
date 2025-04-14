package com.softserve.threads.homework3;

public class TestThread3 implements Runnable{
    @Override
    public void run( ) {
        synchronized(ApplThreads.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("This is thread #3");
            }
        }
    }
}

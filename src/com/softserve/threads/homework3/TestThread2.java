package com.softserve.threads.homework3;

public class TestThread2 implements Runnable{
    @Override
    public void run( ) {
        synchronized(ApplThreads.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println("This is thread #2");
            }
        }
    }
}

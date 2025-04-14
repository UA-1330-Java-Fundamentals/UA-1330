package com.softserve.threads.homework;

public class MyThread2 implements Runnable{
    @Override
    public void run( ) {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread #2 says hello");
        }

    }
}

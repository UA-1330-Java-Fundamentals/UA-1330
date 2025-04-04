package com.softserve.threads.homework;

public class MyThread1 implements Runnable{
    @Override
    public void run( ) {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread #1 says hello");
        }

    }
}

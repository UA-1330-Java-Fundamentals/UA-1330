package com.softserve.threads.homework;

public class MyThread3 implements Runnable{
    @Override
    public void run( ) {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread #3 says hello");
        }

    }
}

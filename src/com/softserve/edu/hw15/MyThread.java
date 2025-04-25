package com.softserve.edu.hw15;

public class MyThread extends Thread {
    String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}

package com.softserve.edu.hw15Threads;

public class Task3ThreeTreads {
    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }

                Thread three = new Thread(() -> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread number three");
                    }
                });

                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        one.start();
        one.join();
        System.out.println("The end");
    }
}



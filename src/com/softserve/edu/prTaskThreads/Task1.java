package com.softserve.edu.prTaskThreads;

import java.time.Duration;

//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i < 10; i++) {
            System.out.println("I study Java");
            Thread.sleep(Duration.ofSeconds(1));
        }
    }
}

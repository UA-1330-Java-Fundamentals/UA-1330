package com.softserve.err.homework;

public class ApplBird {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Brown", "Lays eggs"),
                new Swallow("Black and white ", "Lays eggs"),
                new Penguin("Black and white", "Lays eggs"),
                new Kiwi("Brown", "Lays eggs")
        };
        for (Bird currentBird: birds){
            System.out.println("Current bird = " + currentBird);
        }
    }
}

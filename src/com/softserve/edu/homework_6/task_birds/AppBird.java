package com.softserve.edu.homework_6.task_birds;

public class AppBird {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        // Looping through the array to call fly() and displayInfo()
        for (Bird bird : birds) {
            bird.displayInfo();
            bird.fly();
            System.out.println("------------------------");
        }
    }
}

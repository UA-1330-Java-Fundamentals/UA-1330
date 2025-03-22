package com.softserve.edu.hw6.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle("Brown feathers", true);
        birds[1] = new Swallow("Blue feathers", true);
        birds[2] = new Penguin("Black and white feathers", true);
        birds[3] = new Kiwi("Brown feathers", true);

        for (Bird bird : birds) {
            bird.fly();
        }

        for (Bird bird : birds) {
            System.out.println("Feathers: " + bird.feathers + ", Lay Eggs: " + bird.layEggs);
        }
    }
}

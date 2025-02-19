package com.softserve.edu.homework6_OOP_Part1.task1;

public class BirdApp {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Penguin(), new Kiwi(),new Swallow()};
        for (Bird bird : birds) {
            System.out.print(bird);
            bird.fly();
        }
    }
}

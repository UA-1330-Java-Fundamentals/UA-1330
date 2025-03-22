package com.softserve.edu.hw6.Task1;

public class Penguin extends NonflyingBird {
    public Penguin (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }
}
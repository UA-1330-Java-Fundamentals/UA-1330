package com.softserve.edu.hw6.Task1;

public class Swallow extends FlyingBird {
    public Swallow (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Swallow can fly");
    }
}
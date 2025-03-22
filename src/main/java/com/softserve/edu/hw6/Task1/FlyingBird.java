package com.softserve.edu.hw6.Task1;

public class FlyingBird extends Bird {
    public FlyingBird (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can fly");
    }
}
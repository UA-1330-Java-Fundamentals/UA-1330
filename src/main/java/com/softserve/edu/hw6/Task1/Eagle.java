package com.softserve.edu.hw6.Task1;

public class Eagle extends FlyingBird {
    public Eagle (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}
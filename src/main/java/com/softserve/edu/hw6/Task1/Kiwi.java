package com.softserve.edu.hw6.Task1;

public class Kiwi extends NonflyingBird {
    public Kiwi (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi can't fly");
    }
}
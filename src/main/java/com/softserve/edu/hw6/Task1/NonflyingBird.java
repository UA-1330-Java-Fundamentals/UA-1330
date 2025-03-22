package com.softserve.edu.hw6.Task1;

public class NonflyingBird extends Bird {
    public NonflyingBird (String feathers, boolean layEggs) {
    super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can't fly");
    }
}

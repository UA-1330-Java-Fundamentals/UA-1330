package com.softserve.edu.homework_6.task_birds;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }
}

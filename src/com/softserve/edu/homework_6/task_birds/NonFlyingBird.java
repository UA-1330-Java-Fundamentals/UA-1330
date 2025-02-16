package com.softserve.edu.homework_6.task_birds;

abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " cannot fly.");
    }
}
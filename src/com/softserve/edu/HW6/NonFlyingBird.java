package com.softserve.edu.HW6;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return false;
    }
}

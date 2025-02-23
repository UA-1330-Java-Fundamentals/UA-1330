package com.softserve.edu.HW6;

public abstract class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }

}

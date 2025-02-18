package com.softserve.edu.HW5_6_OOP_Part_1.Task_1;


public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "This bird can fly.";
    }


}

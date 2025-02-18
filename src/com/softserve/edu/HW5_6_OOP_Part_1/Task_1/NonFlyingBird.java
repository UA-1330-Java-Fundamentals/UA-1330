package com.softserve.edu.HW5_6_OOP_Part_1.Task_1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "This bird cannot fly.";
    }


}

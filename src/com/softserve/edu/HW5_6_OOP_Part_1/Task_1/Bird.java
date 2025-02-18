package com.softserve.edu.HW5_6_OOP_Part_1.Task_1;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();
}

package com.softserve.edu.hw6.Task1;

abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
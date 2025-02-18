package com.softserve.edu.less06.task1;

public abstract class Bird {
    int feathers;
    int layEggs;
    abstract String fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

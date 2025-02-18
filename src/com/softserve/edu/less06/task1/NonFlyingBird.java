package com.softserve.edu.less06.task1;

public class NonFlyingBird extends Bird {
    public int getFeather() {
        return this.feathers;
    }

    public int getLayEggs() {
        return this.layEggs;
    }

    @Override
    public String fly() {
        return "The bird cannot fly";
    }

}

package com.softserve.err.homework;

public abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers,String layEggs)  {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract boolean fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                " Ability to fly " + fly() +
                '}';
    }
}

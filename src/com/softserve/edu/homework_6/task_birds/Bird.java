package com.softserve.edu.homework_6.task_birds;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayInfo() {
        System.out.println("Feathers: " + feathers);
        System.out.println("Lays Eggs: " + (layEggs ? "Yes" : "No"));
    }
}


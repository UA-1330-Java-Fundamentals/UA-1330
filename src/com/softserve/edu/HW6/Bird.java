package com.softserve.edu.HW6;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers; //all birds have feathers
        this.layEggs = true; //all birds lay eggs
    }

    public abstract boolean fly();

    public abstract String getName();

    public void displayBirdInfo() {
        System.out.println("Bird: " + getName());
        System.out.println("Feathers: " + feathers);
        System.out.println("Lay eggs: " + (layEggs  ? "Yes":"No"));
        System.out.println("Can fly: " + (fly() ? "Yes":"No"));
        System.out.println("-------------------");
    }
}

package com.softserve.edu.homework_7.task_2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int maxHeight, int weight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing");
    }
}

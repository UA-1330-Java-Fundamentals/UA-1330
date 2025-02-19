package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Helicopter extends FlyingVehicle implements Vehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {
        this.weight = 0;
        this.maxHeight = 0;
    }

    public void fly() {
        System.out.println("Helicopter is flying.");
    }

    public void land() {
        System.out.println("Helicopter is landing.");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return "Helicopter with weight " + weight + " kg and max height " + maxHeight + " m";
    }
}

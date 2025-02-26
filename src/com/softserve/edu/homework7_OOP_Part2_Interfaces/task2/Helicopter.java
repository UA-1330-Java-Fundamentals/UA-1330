package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class Helicopter extends FlyingVehicle{
    private int weight, maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }


    @Override
    void fly() {
        System.out.println("Helicopter start flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter landed");
    }
}

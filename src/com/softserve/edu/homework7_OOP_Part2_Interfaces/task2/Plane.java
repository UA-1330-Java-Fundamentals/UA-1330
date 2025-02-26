package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane start flying for "+ getMaxDistance() + " distance");
    }

    @Override
    void land() {
        System.out.println("Plane landed");
    }
}

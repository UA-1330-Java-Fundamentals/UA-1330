package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Plane extends FlyingVehicle implements Vehicle {
    private int maxDistance;

    public Plane() {
        this.maxDistance = 0;
    }

    public void fly() {
        System.out.println("Plane is flying.");
    }

    public void land() {
        System.out.println("Plane is landing.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
    @Override
    public String toString() {
        return "Plane with max distance " + maxDistance + " km";
    }
}
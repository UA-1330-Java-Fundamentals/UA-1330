package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 0;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving.");
    }

    @Override
    public String toString() {
        return "Motorcycle with max speed " + maxSpeed + " km/h";
    }
}
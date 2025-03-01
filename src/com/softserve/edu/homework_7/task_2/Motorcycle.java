package com.softserve.edu.homework_7.task_2;

public class Motorcycle extends GroundVehicle {
    private int MaxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is driving");
    }
}

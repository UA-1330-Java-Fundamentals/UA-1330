package com.softserve.oop2hw2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(){
        this.maxSpeed = 1;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void drive(){
        System.out.println("Motorcycle is driving");
    }

    @Override
    public String toString() {
        return "Motorcycle," +
                " maxSpeed:" + maxSpeed;
    }
}

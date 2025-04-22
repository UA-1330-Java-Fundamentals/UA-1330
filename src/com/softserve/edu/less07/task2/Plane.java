package com.softserve.edu.less07.task2;

public class Plane extends FlyngVehicle {
    private int maxDistanse;

    public Plane(int passengers, int maxDistanse) {
        super(passengers);
        this.maxDistanse = maxDistanse;
    }

    public int getMaxDistanse() {
        return maxDistanse;
    }

    public void setMaxDistanse(int maxDistanse) {
        this.maxDistanse = maxDistanse;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistanse=" + maxDistanse +
                '}';
    }
}

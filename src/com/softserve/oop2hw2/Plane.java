package com.softserve.oop2hw2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
        this.maxDistance = 1;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly(){
        System.out.println("This Plain is flying");
    }
    @Override
    public void land(){
        System.out.println("This Plain is landing");
    }

    @Override
    public String toString() {
        return "Plane," +
                " maxDistance:" + maxDistance;
    }
}

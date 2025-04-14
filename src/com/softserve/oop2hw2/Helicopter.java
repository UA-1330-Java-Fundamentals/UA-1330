package com.softserve.oop2hw2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){
        this.weight = 1;
        this.maxHeight = 1;
    }
    @Override
    public void fly(){
        System.out.println("This Helicopter is flying");
    }
    @Override
    public void land(){
        System.out.println("This Helicopter is landing");
    }

    @Override
    public String toString() {
        return "Helicopter," +
                "weight:" + weight +
                ", maxHeight:" + maxHeight;
    }
}

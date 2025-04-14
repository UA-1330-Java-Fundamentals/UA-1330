package com.softserve.oop2hw2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {

    }

    public void fly(){
        System.out.println("This vehicle is flying");
    }

    public void land(){
        System.out.println("This vehicle is landing");
    }
}

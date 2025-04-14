package com.softserve.oop2hw2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle() {

    }

    public void drive(){
        System.out.println("This vehicle is driving");
    }

}

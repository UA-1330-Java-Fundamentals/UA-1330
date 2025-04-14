package com.softserve.oop2hw2;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    public void isSailing(){
        System.out.println("This vehicle is sailing");
    }

    @Override
    public String toString() {
        return "WaterVehicle";
    }
}

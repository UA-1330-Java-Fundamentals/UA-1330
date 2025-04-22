package com.softserve.edu.less07.task2;

public abstract class GroundVehicle extends Passengers implements Vechicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}

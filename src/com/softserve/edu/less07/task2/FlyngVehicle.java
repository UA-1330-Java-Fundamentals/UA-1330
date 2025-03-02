package com.softserve.edu.less07.task2;

public abstract class FlyngVehicle extends Passengers implements Vechicle {
    public FlyngVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();

    public abstract void land();
}

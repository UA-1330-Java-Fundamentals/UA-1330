package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();

    abstract void land();
}

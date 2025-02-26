package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}

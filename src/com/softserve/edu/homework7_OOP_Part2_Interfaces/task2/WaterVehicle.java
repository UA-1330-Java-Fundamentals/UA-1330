package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}

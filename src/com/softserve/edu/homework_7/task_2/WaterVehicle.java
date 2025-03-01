package com.softserve.edu.homework_7.task_2;

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}

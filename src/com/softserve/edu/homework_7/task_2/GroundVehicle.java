package com.softserve.edu.homework_7.task_2;

abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}

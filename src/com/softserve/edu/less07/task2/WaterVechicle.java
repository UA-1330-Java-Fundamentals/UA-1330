package com.softserve.edu.less07.task2;

public abstract class WaterVechicle extends Passengers implements Vechicle{
    public WaterVechicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}

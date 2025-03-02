package com.softserve.edu.less07.task2;

public class Liner extends WaterVechicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                '}';
    }
}

package com.softserve.edu.less07.task2;

public class Boat extends WaterVechicle {
    private int volume;

    @Override
    public void isSailing() {

    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

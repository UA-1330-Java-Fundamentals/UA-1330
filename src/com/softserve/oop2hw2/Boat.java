package com.softserve.oop2hw2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
        this.volume = 1;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing(){
        System.out.println("Boat is sailing");
    }

    @Override
    public String toString() {
        return "Boat," +
                " volume:" + volume;
    }
}

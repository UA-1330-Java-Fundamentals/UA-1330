package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Boat extends  WaterVehicle{
    private int volume;
    public Boat() {
        this.volume = 0;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public void isSailing() {
        System.out.println("Boat is sailing.");
    }
    @Override
    public String toString() {
        return "Boat with volume " + volume;
    }
}

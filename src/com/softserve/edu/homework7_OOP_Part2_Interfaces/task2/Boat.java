package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class Boat extends WaterVehicle{
    private int volume;

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


    @Override
    void isSailing() {
        System.out.println("The boat is sailing");
    }
}

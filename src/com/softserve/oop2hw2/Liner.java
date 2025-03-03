package com.softserve.oop2hw2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner() {
        this.floors = 1;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing(){
        System.out.println("Liner is sailing");
    }

    @Override
    public String toString() {
        return "Liner, " +
                " floors:" + floors;
    }
}

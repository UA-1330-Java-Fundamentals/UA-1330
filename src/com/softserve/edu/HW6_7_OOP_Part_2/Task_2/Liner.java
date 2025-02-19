package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Liner extends WaterVehicle{

    private  int floors;
    public Liner() {
        this.floors = 0;
    }
    @Override
    public void isSailing() {
        System.out.println("Liner is sailing.");
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    @Override
    public String toString() {
        return "Liner with " + floors + " floors";
    }
}

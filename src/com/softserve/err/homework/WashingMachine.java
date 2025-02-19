package com.softserve.err.homework;

public class WashingMachine extends Appliance{
    private int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void displayInfo(){
        System.out.println("Washing Machine - "  + super.toString() +
                "Capacity: " + getLoadCapacity() + " kg");
    }
}

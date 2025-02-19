package com.softserve.err.homework;

public class Refrigerator extends Appliance{
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    public void displayInfo(){
        System.out.println("Refrigerator - "  + super.toString() +
                "Capacity: " + getCapacity() + " liters");
    }
}

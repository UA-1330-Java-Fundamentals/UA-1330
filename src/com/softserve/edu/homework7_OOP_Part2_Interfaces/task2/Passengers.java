package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

abstract  class Passengers {

    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

package com.softserve.edu.homework_6.task_birds;

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown Feathers", true);
    }

    @Override
    public void displayInfo() {
        System.out.println("Kiwi: A small flightless bird from New Zealand.");
        super.displayInfo();
    }
}
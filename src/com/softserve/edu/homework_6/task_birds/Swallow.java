package com.softserve.edu.homework_6.task_birds;

class Swallow extends FlyingBird {
    public Swallow() {
        super("Light Brown Feathers", true);
    }

    @Override
    public void displayInfo() {
        System.out.println("Swallow: A small, agile bird.");
        super.displayInfo();
    }
}
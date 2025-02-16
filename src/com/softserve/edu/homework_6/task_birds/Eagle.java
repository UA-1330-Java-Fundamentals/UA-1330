package com.softserve.edu.homework_6.task_birds;

class Eagle extends FlyingBird {
    public Eagle() {
        super("Dark Brown Feathers", true);
    }

    @Override
    public void displayInfo() {
        System.out.println("Eagle: A strong bird of prey.");
        super.displayInfo();
    }
}
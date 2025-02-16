package com.softserve.edu.homework_6.task_birds;

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and White Feathers", true);
    }

    @Override
    public void displayInfo() {
        System.out.println("Penguin: A swimming bird from cold regions.");
        super.displayInfo();
    }
}
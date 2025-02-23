package com.softserve.edu.HW6;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super("Dense, waterproof", true);
    }

    @Override
    public String getName() {
        return "Penguin";
    }

}

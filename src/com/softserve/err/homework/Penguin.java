package com.softserve.err.homework;

public class Penguin extends NonFlyingBird{

    public Penguin(String feathers,String layEggs)  {
        super(feathers,layEggs);
    }
    @Override
    public String toString() {
        return "This is Penguin " + super.toString();
    }
}

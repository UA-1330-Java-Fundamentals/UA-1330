package com.softserve.err.homework;

public class Swallow extends FlyingBird{
    public Swallow(String feathers,String layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String toString() {
        return "This is Swallow " + super.toString();
    }
}

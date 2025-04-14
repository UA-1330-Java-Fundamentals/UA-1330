package com.softserve.err.homework;

public class Kiwi extends NonFlyingBird{

    public Kiwi(String feathers,String layEggs)  {
        super(feathers,layEggs);
    }
    @Override
    public String toString() {
        return "This is Kiwi " + super.toString();
    }
}

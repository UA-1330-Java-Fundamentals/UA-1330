package com.softserve.err.homework;

public abstract class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers,String layEggs)  {
        super(feathers,layEggs);
    }
    public boolean fly(){
        return false;
    }
}

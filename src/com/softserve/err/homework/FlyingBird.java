package com.softserve.err.homework;

public abstract class FlyingBird extends Bird{

    public FlyingBird(String feathers,String layEggs)  {
        super(feathers,layEggs);
    }

    public boolean fly(){
       return true;
    }
}

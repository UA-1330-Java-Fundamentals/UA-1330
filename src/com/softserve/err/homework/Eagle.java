package com.softserve.err.homework;

public class Eagle extends FlyingBird{

    public Eagle(String feathers,String layEggs){
        super(feathers,layEggs);
    }

    public String haveFeathers(){
        return "I have brown feathers";
    }

    @Override
    public String toString() {
        return "This is Eagle " + super.toString();
    }
}

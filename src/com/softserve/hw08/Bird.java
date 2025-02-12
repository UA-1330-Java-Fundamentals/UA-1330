package com.softserve.hw08;

public abstract class Bird {

    public abstract boolean fly();

    public abstract String getName();

    @Override
    public String toString() {
        //return  "Is fly " + fly();
        //return "This is " + this.getClass().getName() + " Is fly " + fly();
        return "This is " + getName() + ". Is fly : " + fly();
    }
}

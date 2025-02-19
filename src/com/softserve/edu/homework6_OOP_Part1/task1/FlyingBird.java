package com.softserve.edu.homework6_OOP_Part1.task1;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
//this.getClass().getClass().getName().lastIndexOf(".")+
    @Override
    public String toString() {
        return "Bird{ Kind =" + getClass().getSimpleName() +
        ", Feathers='" + feathers + '\'' +
                ", Lay Eggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.println(" Bird can fly");
    }
}

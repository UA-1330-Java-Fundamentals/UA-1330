package com.softserve.edu.homework6_OOP_Part1.task1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(" Bird can not fly");
    }

    @Override
    public String toString() {
        return "Bird{ Kind =" + getClass().getSimpleName() +
                ", Feathers='" + feathers + '\'' +
                ", Lay Eggs=" + layEggs +
                '}';
    }
}

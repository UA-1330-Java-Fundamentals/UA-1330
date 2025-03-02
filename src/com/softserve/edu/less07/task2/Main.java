package com.softserve.edu.less07.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Passengers> list = new ArrayList<Passengers>();
        list.add(new Car(5,"Toyota"));
        list.add(new Motorcycle(1,100));
        list.add(new Bus(1,"Proektna"));
        list.add(new Helicopter(1,55,169));
        list.add(new Plane(2,300));
        list.add(new Boat(4,500));
        list.add(new Liner(100,5));
        for (Passengers p : list) {
            System.out.println(p);
        }
    }
}

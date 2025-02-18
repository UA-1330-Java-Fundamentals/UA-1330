package com.softserve.edu.HW5_6_OOP_Part_1;

import com.softserve.edu.HW5_6_OOP_Part_1.Task_1.*;
import com.softserve.edu.HW5_6_OOP_Part_1.Task_2.Developer;
import com.softserve.edu.HW5_6_OOP_Part_1.Task_2.Employee;

public class Main {

    public static void main (String[]args){


        //Task 1

        //1. Create abstract class called Bird by scheme
        //with attributes feathers and layEggs and an
        //abstaract fly() method.

        //2. Create classes FlyingBird and NonFlyingBird.

        //3. Create classes Eagle, Swallow, Penguin and
        //Kiwi.

        //4. In main() method create an array Bird and
        //add different birds to it. Call fly() method for
        //all of it. Output the information about each
        //type of created bird.

        System.out.println(" Task 1");

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println(bird.fly());
        }

        System.out.println("\n Task 2");


        //Task 2

        Employee employee = new Employee("Ivan", 28, 25000.50);
        System.out.println(employee.report());

        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println(developer.report());


    }


}















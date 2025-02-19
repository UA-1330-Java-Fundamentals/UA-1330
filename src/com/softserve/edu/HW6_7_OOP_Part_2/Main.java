package com.softserve.edu.HW6_7_OOP_Part_2;

import com.softserve.edu.HW6_7_OOP_Part_2.Task_1.ContractEmployee;
import com.softserve.edu.HW6_7_OOP_Part_2.Task_1.Employee;
import com.softserve.edu.HW6_7_OOP_Part_2.Task_1.Payment;
import com.softserve.edu.HW6_7_OOP_Part_2.Task_1.SalariedEmployee;
import com.softserve.edu.HW6_7_OOP_Part_2.Task_2.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //1. Create an interface called Payment with the method calculatePay(), the base
        //abstract class called Employee with a String variable employeeld.
        //  o Create two classes, SalariedEmployee and ContractEmployee, which
        //implement Payment interface and inherit from the base class Employee.
        //• Describe hourly-paid workers in the relevant classes (one of the child
        //classes), and fixed paid workers in the other.
        //• Describe the String variable socialSecurityNumber in the
        //SalariedEmployee class .
        //• Include a description of federalTaxIdmember variable in the
        //ContractEmployee class.
        //• The calculation formula for the hourly workers is as follow:
        //the average monthly salary = hourly rate * number of hours worked
        //• For employees with a fixed salary the formula is simply:
        //the average monthly salary = fixed monthly payment
        //o In main() method create an array of employees and add the employees
        //with different form of payment.
        //o Arrange the entire sequence of workers in descending order of the average
        //monthly wage. Output the employee ID, name, and the average monthly
        //wage for all elements of the list.

        System.out.println("-------------------  Task 1 ---------------------");


        Employee[] employees = new Employee[] {
                new SalariedEmployee("E001", "123-45-6789", 5000.0),
                new ContractEmployee("E002", "987-65-4321", 25.0, 160),
                new SalariedEmployee("E003", "456-78-9123", 6000.0),
                new ContractEmployee("E004", "321-54-6789", 30.0, 120)
        };


        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(((Payment) e2).calculatePay(), ((Payment) e1).calculatePay());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        System.out.println("\n-------------------  Task 2 ---------------------");


        Liner liner = new Liner();
        liner.setFloors(5);

        Boat boat = new Boat();
        boat.setVolume(500);

        Plane plane = new Plane();
        plane.setMaxDistance(10000);

        Helicopter helicopter = new Helicopter();
        helicopter.setWeight(2000);
        helicopter.setMaxHeight(5000);

        Bus bus = new Bus();
        bus.setRoute("Downtown");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMaxSpeed(120);

        Car car = new Car();
        car.setModel("Toyota");


        Vehicle[] vehicles = {
                boat,
                liner,
                plane,
                helicopter,
                bus,
                motorcycle,
                car
        };


        for (Vehicle current : vehicles) {


            if (current instanceof GroundVehicle) {
                ((GroundVehicle) current).drive();
                System.out.println(current);
            }
            if (current instanceof FlyingVehicle) {
                ((FlyingVehicle) current).fly();
                ((FlyingVehicle) current).land();
                System.out.println(current);
            }
            if (current instanceof WaterVehicle) {
                ((WaterVehicle) current).isSailing();
                System.out.println(current);
            }

            System.out.println();
        }

    }
}

package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(4, "Toyota"),
                new Bus(18, "Kyiv"),
                new Motorcycle(1, 200),
                new Boat(2, 20),
                new Liner(210, 5),
                new Plane(80, 1200),
                new Helicopter(4, 2000, 5000)
        };

        for (Vehicle vehicle : vehicles){


            if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            }
            if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            }
        }
    }
}

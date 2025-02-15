package com.softserve.edu.homework5_ArraysLoops;

import java.util.Scanner;

/*
Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
• Output result for cars:
    o certain model year (enter year in the console);
    o sorted cars by the field “year of production ”
 */

public class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = {
                new Car("Sedan", 2020, 1.8),
                new Car("Liftback", 2018, 2.0),
                new Car("Hatchback", 2024, 1.6)
        };

        System.out.print("Enter the model year: ");
        int modelYear = scanner.nextInt();
        System.out.println("Cars of model year " + modelYear + ":");
        for (Car car : cars){
            if (car.yearOfProduction == modelYear){
                System.out.println(car);
            }
        }
        //Sort cars like in lesson

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].yearOfProduction > cars[j + 1].yearOfProduction) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }

        System.out.println("Cars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }
}

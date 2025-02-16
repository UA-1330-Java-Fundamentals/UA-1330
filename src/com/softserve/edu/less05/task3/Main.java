package com.softserve.edu.less05.task3;

import java.util.Scanner;

/*
* Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
• Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”.
*/
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota Camry", 2020, 2.5),
                new Car("Ford Mustang", 2018, 5.0),
                new Car("Honda Civic", 2022, 1.5),
                new Car("Ford Mustang", 2018, 5.0)
        };
        System.out.println("Enter year of the car : ");
        int year = SCANNER.nextInt();
        boolean found = false;
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Car not found");
        }
        SCANNER.close();
        System.out.println("=".repeat(58));
        sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

}


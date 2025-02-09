/**
 * Create class called Car with fields: type, year of production and engine capacity.
 * • Create and initialize in main() method four instances of class Car.
 * • Output result for cars:
 * o certain model year (enter year in the console);
 * o sorted cars by the field “year of production ”.
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private String type;
    private int yearOfTheProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfTheProduction, double engineCapacity) {
        this.type = type;
        this.yearOfTheProduction = yearOfTheProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfTheProduction() {
        return yearOfTheProduction;
    }

    public void setYearOfTheProduction(int yearOfTheProduction) {
        this.yearOfTheProduction = yearOfTheProduction;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car: " +
                "type = '" + type + '\'' +
                ", yearOfTheProduction = " + yearOfTheProduction +
                ", engineCapacity = " + engineCapacity;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car firstCar = new Car("SUV", 2001, 1500);
        Car secondCar = new Car("Sedan", 1999, 1000);
        Car thirdCar = new Car("Sports car", 2001, 1146);
        Car fourthCar = new Car("Coupe", 2021, 3799);

        Car[] cars = {firstCar, secondCar, thirdCar, fourthCar};

        System.out.print("Enter a year to search for the car: ");
        int year = Integer.parseInt(br.readLine());
        System.out.println("\nCars from year " + year + ": ");
        boolean isFound = false;
        for (Car car : cars) {
            if (car.yearOfTheProduction == year) {
                isFound = true;
                System.out.println(car);
            }
        }
        if (!isFound) {
            System.out.println("No cars found for the year " + year + ".");
        }


        System.out.println("\nSorted cars:\n");
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].yearOfTheProduction > cars[j + 1].yearOfTheProduction) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

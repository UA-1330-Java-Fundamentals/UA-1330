package com.softserve.loopsandarrays;

import java.util.Scanner;

public class Car {
    private String type;
    private long yearOfProduction;
    private double engineCapacity;
    Scanner sc = new Scanner(System.in);

    public Car(String type, double engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setYearOfProduction(long yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public long getYearOfProduction() {
        return yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void enterYearOfProduction(){
        System.out.println("Enter the year of production ");
        long year = sc.nextLong();
        setYearOfProduction(year);
    }


    @Override
    public String toString() {
        return "Car " +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity;
    }
    public static void sortByYear(Car[] arrOfCars){
        Car tmp;
        for (int i = 0; i < arrOfCars.length - 1; i++) {
            for (int j = 0; j < arrOfCars.length - i - 1; j++) {
                if (arrOfCars[j].getYearOfProduction() < arrOfCars[j + 1].getYearOfProduction()) {
                    tmp = arrOfCars[j];
                    arrOfCars[j] = arrOfCars[j + 1];
                    arrOfCars[j + 1] = tmp;
                }
            }
        }
    }

}

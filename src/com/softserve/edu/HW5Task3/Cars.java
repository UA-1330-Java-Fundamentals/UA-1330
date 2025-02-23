package com.softserve.edu.HW5Task3;

import java.util.Objects;

public class Cars {
    private String typeCar;
    private int yearOfProduction;
    private double engineCapacity;


    public Cars(String typeCar, int yearOfProduction, double engineCapacity) {
        this.typeCar = typeCar;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return typeCar;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //check if the same object
        if (o == null || getClass() != o.getClass()) return false; //check null
        Cars cars = (Cars) o;
        return getYearOfProduction() == cars.getYearOfProduction() &&
                Double.compare(getEngineCapacity(), cars.getEngineCapacity()) == 0 &&
                Objects.equals(typeCar, cars.typeCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeCar, getYearOfProduction(), getEngineCapacity());
    }

    @Override
    public String toString() {
        return "Cars{" +
                "type='" + typeCar + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static Cars[] sort(Cars[] carsArray) {
        for (int i = 0; i < carsArray.length - 1; i++) {
            for (int j = 0; j < carsArray.length - i - 1; j++) {
                if (carsArray[j].getYearOfProduction() > carsArray[j + 1].getYearOfProduction()) { // sor by years of production
                    var tmp = carsArray[j];
                    carsArray[j] = carsArray[j + 1];
                    carsArray[j + 1] = tmp;
                }
            }
        }
        return carsArray;
    }

    public static Cars[] searchByYear(Cars[] carsArray, int year) {
        int count = 0;

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].getYearOfProduction() == year) {
                count++;
            }
        }
        //new array from found cars
        Cars[] searchResult = new Cars[count];
        int index = 0;
        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].getYearOfProduction() == year) {
                searchResult[index] = carsArray[i];
                index++;
            }
        }
        return searchResult;
    }
}

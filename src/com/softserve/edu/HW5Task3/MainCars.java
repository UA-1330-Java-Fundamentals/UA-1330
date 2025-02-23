package com.softserve.edu.HW5Task3;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class MainCars {
    public static void main(String[] args) {
        Cars[] carsArray = {
            new Cars("Sedan", 2019, 1.0),
            new Cars("Hatchback", 2020, 2.5),
            new Cars("Sedan", 2022, 1.1),
            new Cars("Coupe", 2018, 1.8)
        };

        System.out.println("Original Cars Array: ");
        for (var car: carsArray) {
            System.out.println("\t" + car);
        }

        Cars[] carsArraySorted = Cars.sort(carsArray);
        System.out.println("Sorted Cars Array by Year of production:" );
        for (var car: carsArraySorted) {
            System.out.println("\t" + car);
        }
    }
}

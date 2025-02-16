package com.softserve.edu.homework_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarTest {
    @Test
    public void createCarWithValidValues() {
        String type = "SUV";
        int year = 2001;
        double engineCapacity = 1500;

        Car car = new Car(type, year, engineCapacity);

        assertEquals(type, car.getType());
        assertEquals(year, car.getYearOfTheProduction());
        assertEquals("Car: type = 'SUV', yearOfTheProduction = 2001, engineCapacity = 1500.0", car.toString());
    }

    @Test
    public void searchNonexistentYear() {
        Car[] cars = {
                new Car("SUV", 2001, 1500),
                new Car("Sedan", 1999, 1000),
                new Car("Sports car", 2001, 1146),
                new Car("Coupe", 2021, 3799)
        };

        int nonExistentYear = 1990;
        boolean found = false;

        for (Car car : cars) {
            if (car.getYearOfTheProduction() == nonExistentYear) {
                found = true;
                break;
            }
        }

        assertFalse(found);
    }
}

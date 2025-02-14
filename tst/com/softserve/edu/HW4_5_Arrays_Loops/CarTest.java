package com.softserve.edu.HW4_5_Arrays_Loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testGetModelYear() {
        Car[] cars = {
                new Car("Toyota Corolla", 2015, 1.8),
                new Car("Ford Mustang", 2020, 5.0),
                new Car("Honda Civic", 2015, 2.0),
                new Car("BMW X5", 2018, 3.0)
        };

        Car[] result = Car.getModelYear(cars, 2015);
        assertEquals(2, result.length);
        assertEquals("Toyota Corolla", result[0].getType());
        assertEquals("Honda Civic", result[1].getType());
    }
    @Test
    void testGetModelYearWithNoMatches() {
        Car[] cars = {
                new Car("Toyota Corolla", 2015, 1.8),
                new Car("Ford Mustang", 2020, 5.0),
                new Car("Honda Civic", 2015, 2.0),
                new Car("BMW X5", 2018, 3.0)
        };

        Car[] result = Car.getModelYear(cars, 2010);
        assertEquals(0, result.length);
    }

    @Test
    void testSortCarsByYear() {
        Car[] cars = {
                new Car("Toyota Corolla", 2015, 1.8),
                new Car("Ford Mustang", 2020, 5.0),
                new Car("Honda Civic", 2015, 2.0),
                new Car("BMW X5", 2018, 3.0)
        };

        Car.sortCarsByYear(cars);
        assertEquals(2015, cars[0].getYearOfProduction());
        assertEquals(2015, cars[1].getYearOfProduction());
        assertEquals(2018, cars[2].getYearOfProduction());
        assertEquals(2020, cars[3].getYearOfProduction());
    }
}
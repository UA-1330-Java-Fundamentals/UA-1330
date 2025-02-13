package HomeWorkFromPDF5;

import HomeWorkFromPDF.HomeWorkFromPDF5.homeWork3;
import HomeWorkFromPDF.HomeWorkFromPDF5.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class homeWork3Test {

    Car[] cars = {
            new Car("SUV", 2006, 1.6),
            new Car("sedan", 2026, 9.0),
            new Car("coupe", 1992, 2.5),
            new Car("crossover", 2014, 0.7)
    };

    @Test
    public void testGetTypeByYear_Found() {
        String expected = "SUV";
        String actual = homeWork3.getTypeByYear(cars, 2006);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeByYear_NotFound() {
        String expected = "";
        String actual = homeWork3.getTypeByYear(cars, 1999);
        Assertions.assertEquals(expected, actual);
    }
}


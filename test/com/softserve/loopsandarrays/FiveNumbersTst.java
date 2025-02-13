package com.softserve.loopsandarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiveNumbersTst {
    @Test
    public void checkSecondPositive(){
        FiveNumbers newFive = new FiveNumbers();
        int[] bufArray = {1, -2, 3, -4, 5};
        String actual = newFive.secondPositive(bufArray);
        Assertions.assertTrue(actual.contains("3"));
    }

    @Test
    public void checkNoSecondPositive(){
        FiveNumbers newFive = new FiveNumbers();
        int[] bufArray = {1, -2, -3, -4, 0};
        String actual = newFive.secondPositive(bufArray);
        Assertions.assertTrue(actual.equals("Second positive number not found"));
    }

    @Test
    public void checkMaxValueAndPosition(){
        FiveNumbers newFive = new FiveNumbers();

        int[] bufArray = {2, -4, 6, -8, 10};
        String actual = newFive.maxValueAndPosition(bufArray);
        Assertions.assertTrue(actual.contains("10"));
    }

    @Test
    public void checkProductOfElements(){
        FiveNumbers newFive = new FiveNumbers();

        int[] bufArray = {0, 1, 2, 3, 4};
        double actual = newFive.productOfElements(bufArray);
        Assertions.assertEquals(24.0,actual);
    }
}

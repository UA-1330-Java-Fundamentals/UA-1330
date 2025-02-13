package com.softserve.loopsandarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfNumbersTest {
    @Test
    public void checkSum(){
        SumOfNumbers newSum = new SumOfNumbers();

        int[] bufArray = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        String actual = newSum.sumOrProductOfElements(bufArray);
        Assertions.assertTrue(actual.contains("We counted sum of first 5 numbers"));
    }

    @Test
    public void checkProduct(){
        SumOfNumbers newSum = new SumOfNumbers();

        int[] bufArray = {1, -2, 3, -4, 5 , 6, 7, 8, 9, 10};
        String actual = newSum.sumOrProductOfElements(bufArray);
        Assertions.assertTrue(actual.contains("We counted product of last 5 numbers"));
    }
}

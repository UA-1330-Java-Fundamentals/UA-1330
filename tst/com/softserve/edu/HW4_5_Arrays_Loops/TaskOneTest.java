package com.softserve.edu.HW4_5_Arrays_Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskOneTest {

    @Test
    void testGetNumberOfDaysInMonth() {
        assertEquals(31, TaskOne.getNumberOfDaysInMounth(1, "no"));
        assertEquals(29, TaskOne.getNumberOfDaysInMounth(2, "yes"));
        assertEquals(30, TaskOne.getNumberOfDaysInMounth(4, "no"));
        assertEquals(0, TaskOne.getNumberOfDaysInMounth(13, "no"));
    }

    @Test
    void testSumOrProductCalculator() {
        assertEquals(15, TaskOne.sumOrProductCalculator(new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5}));
        assertEquals(120, TaskOne.sumOrProductCalculator(new int[]{-1, -2, -3, -4, -5, 1, 2, 3, 4, 5}));
    }

    @Test
    void testGetPositionOfMinimalValue() {
        assertEquals(2, TaskOne.getPoditionOfMinimslValue(new int[]{3, 2, 1, 4, 5}));
    }

    @Test
    void testGetProductOfPositiveEvenNumbers() {
        assertEquals(8, TaskOne.getProductOfPositiveNumber(new int[]{2, 4, 1, 5, 3}));
        assertEquals(0, TaskOne.getProductOfPositiveNumber(new int[]{1, 3, 5, 7, 9}));
    }

    @Test
    void testGetSecondPositive() {
        assertEquals(3, TaskOne.getSecondPositive(new int[]{-1, -2, 5, 6, 0}));
        assertEquals(-1, TaskOne.getSecondPositive(new int[]{-1, -2, -3, 0, 5}));
    }
}
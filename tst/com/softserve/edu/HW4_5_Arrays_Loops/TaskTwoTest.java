package com.softserve.edu.HW4_5_Arrays_Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTwoTest {
    @Test
    void testGetSumOfTwoNumbers() {
        assertEquals(5, TaskTwo.getSumOfTwoNumber(2, 3));
        assertEquals(0, TaskTwo.getSumOfTwoNumber(-2, 2));
        assertEquals(-5, TaskTwo.getSumOfTwoNumber(-3, -2));
    }
}

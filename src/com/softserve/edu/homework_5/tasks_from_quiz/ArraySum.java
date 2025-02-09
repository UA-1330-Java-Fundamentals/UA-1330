package com.softserve.edu.homework_5.tasks_from_quiz;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(array));
        System.out.println("The sum of the array elements is: " + calculateSum(array));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}

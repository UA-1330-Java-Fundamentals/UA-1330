package com.softserve.edu.homework_5.tasks_from_quiz;

public class EvenSumCalculator {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int evenSum = calculateEvenSum(array);
        System.out.println("The sum of all even numbers in the array: " + evenSum);
    }

    public static int calculateEvenSum(int[] array) {
        int evenSum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }
}

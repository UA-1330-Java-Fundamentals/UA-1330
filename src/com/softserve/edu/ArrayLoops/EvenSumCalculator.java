package com.softserve.edu.ArrayLoops;

public class EvenSumCalculator {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int evenSum = calculateEvenSum(array);
        System.out.println("The sum of all even numbers in the array: " + evenSum);
    }

    public static int calculateEvenSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += array[i];
            }
        }
        return result;
    }
}

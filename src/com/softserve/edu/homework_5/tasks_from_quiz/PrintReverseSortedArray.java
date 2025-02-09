package com.softserve.edu.homework_5.tasks_from_quiz;

import java.util.Arrays;

public class PrintReverseSortedArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("\nInput: " + Arrays.toString(array));
        int[] secondArray = array.clone();
        printReverseSortedArray(secondArray);
        System.out.println("Output: " + Arrays.toString(secondArray));
    }

    private static void printReverseSortedArray(int[] secondArray) {
        boolean isSorted = true;
        int tmp;
        for (int i = 0; i < secondArray.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < secondArray.length - 1 - i; j++) {
                if (secondArray[j] < secondArray[j + 1]) {
                    tmp = secondArray[j];
                    secondArray[j] = secondArray[j + 1];
                    secondArray[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}

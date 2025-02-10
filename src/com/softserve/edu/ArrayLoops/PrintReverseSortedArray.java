package com.softserve.edu.ArrayLoops;

import java.util.Arrays;

public class PrintReverseSortedArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    private static void printReverseSortedArray(int[] array) {
        for (int rows = 0; rows < array.length - 1; rows++ ) {
            for (int i = 0; i < array.length - rows - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(array));
        }
    }
}

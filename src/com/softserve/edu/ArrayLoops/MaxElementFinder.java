package com.softserve.edu.ArrayLoops;

public class MaxElementFinder {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }

    public static int findMaxElement(int[] array) {
        int maxElement = array[0];
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (maxElement < array[i + 1]) {
                    maxElement = array[i + 1];
                }
            }
        }
        else if (array.length == 1) {
            maxElement = array[0];
        }
        return maxElement;
    }
}

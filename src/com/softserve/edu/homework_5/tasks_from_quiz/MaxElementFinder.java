package com.softserve.edu.homework_5.tasks_from_quiz;

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }

    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

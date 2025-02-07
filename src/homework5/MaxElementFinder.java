package homework5;

/*
Write a program to find the maximum element in a given array of integers.

Requirements:
The program should include a method that takes an array of integers as a parameter.
The method should find and return the maximum element in the array.
 */

public class MaxElementFinder {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }

    public static int findMaxElement(int[] array) {
        int max = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }
}
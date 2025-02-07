package homework5;

/*
Write a Java program that sorts a given array of integer values in ascending order and then prints the sorted array in reverse order without modifying the original array.

Requirements:
The program should define a method that accepts an array of integers.
The method should sort the array in ascending order.
The method should then print the sorted array in reverse order without modifying the original array.
The program should demonstrate the functionality of the method with an example array.
 */
import java.util.Arrays;

public class PrintReverseSortedArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    private static void printReverseSortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
      //  Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
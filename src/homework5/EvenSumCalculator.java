package homework5;
/*
Write a program to calculate the sum of all even numbers in a given array of integers.

Requirements:
The program should include a method that takes an array of integers as a parameter.
The method should calculate and return the sum of all even numbers in the array.

 */

public class EvenSumCalculator {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int evenSum = calculateEvenSum(array);
        System.out.println("The sum of all even numbers in the array: " + evenSum);
    }

    public static int calculateEvenSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}


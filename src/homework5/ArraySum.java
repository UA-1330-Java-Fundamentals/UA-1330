package homework5;

/*
Write a Java program that calculates the sum of the values of an integer array with exactly 10 elements by using a separate method to compute the sum of the elements.

Requirements:
The program should use a predefined integer array containing exactly 10 elements.
The program must include a method that calculates the sum of all numbers in the array.
The program should call this method to compute the sum and print the result to the console.
 */

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};
        System.out.println("The sum of the array elements is: " + calculateSum(array));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}



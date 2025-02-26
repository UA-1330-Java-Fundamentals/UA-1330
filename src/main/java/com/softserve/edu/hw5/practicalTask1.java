package com.softserve.edu.hw5;
import java.util.Arrays;
import java.util.Scanner;

public class practicalTask1 {

    public static String[] sortArray(String[] inputArray) {
        Arrays.sort(inputArray);
        return inputArray;
    }

    public static double arrayAvg(int[] inputArray) {
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        avg = (double) sum / inputArray.length;
        return avg;
    }

    public static int findValue(int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == value) {
                System.out.println(value);
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array_string = { "first", "second", "third", "abc" };
        int[] num_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sortArray(array_string)));
        System.out.println(arrayAvg(num_array));
        System.out.println(findValue(num_array, 5));
        sc.close();
    }
}

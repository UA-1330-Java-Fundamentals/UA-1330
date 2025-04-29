package com.softserve.edu.hw12Exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.softserve.edu.hw12Exception.ReaderNumber.readNumber;

//Create a method readNumber(int start, int end), that read from console integer number
// and return it, if it is in the range [start...end]. If an invalid number or non-number text is read,
// the method should throw an exception.
//    Using this method write a method main(), that must enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
public class ReadNumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = 100;
        List<Integer> numbers = new ArrayList<>();
        int i = 1;

        while (i <= 10) {
            //Check if there are enough numbers left to enter from the range
            if ((end- 1 - start) < (10 - numbers.size())) {
                System.out.println("Not enough numbers left to complete 10 entries. Exiting");
                break;
            }
            System.out.println("Enter number #" + i + " (greater than " + start + " and less than " + end + "): ");
            try {
                int number = readNumber(start + 1, end - 1);
                numbers.add(number);
                start = number;
                i++;
                System.out.println("Valid number entered: " + number);

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("All valid numbers entered: " + numbers);
        sc.close();
    }
}
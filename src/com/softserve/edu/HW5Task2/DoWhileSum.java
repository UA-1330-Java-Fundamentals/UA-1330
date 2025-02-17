package com.softserve.edu.HW5Task2;
/*
Create a do-while loop that prompts the user to enter two numbers and
calculates their sum. After displaying the result,
the program should ask the user if they want to perform the operation again.
If the user inputs a positive response, the loop should repeat;
otherwise, it should terminate.
 */
import java.util.Scanner;
 public class DoWhileSum {
    public static double getSum(double number1, double number2) {
        double sum = 0;
        sum =  number1 + number2;
        return sum;
    }
    public static boolean isContinue(Scanner sc) {
        System.out.println("Do you want to continue? Enter: Yes or No ");
        String answer = sc.next().toLowerCase();
        return answer.equals("yes");
    }
}

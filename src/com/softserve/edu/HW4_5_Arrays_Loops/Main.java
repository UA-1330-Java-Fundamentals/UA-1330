package com.softserve.edu.HW4_5_Arrays_Loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




//        1. Create a program (in different java documents) that prompts the user to enter:
//              • a month number and calculates the number of days in that month based on an array
//        that contains the number of days in each month.
//              • 10 integers numbers and calculates the sum of the first five elements if they are
//        positive, or the product of the last five elements if they are not and output the result.
//              • 5 integer numbers and find:
//        o position of second positive number;
//        o minimum value and its position in the array.
//        o calculate the product of all entered even numbers (exclude 0 from even if entered by
//                user).

        int numOfMounth, numOfDay = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("*Input a number of anything month");
        numOfMounth = sc.nextInt();

        System.out.println("Is there a leap year?(Yes/no)");
        String testLeap = sc.next();

        switch (testLeap.toLowerCase()){
            case "yes","+"-> numOfDay = TaskOne.getIumberDaysInMonthLeapYear(numOfMounth);
            case "no","-" -> numOfDay = TaskOne.getIumberDaysInMonthNOTLeapYear(numOfMounth);
            default -> {
                System.out.println("Incorect  input! Input Yes, +, No або -");
                return ;
            }
        }
        System.out.println("Mounts #" + numOfMounth + "have "+ numOfDay +"days");

        int[] numbers = new int[10];

        System.out.println("*Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(TaskOne.sumOrProductCalculator(numbers));


//        2. Create a do-while loop that prompts the user to enter two numbers and calculates their
//        sum. After displaying the result, the program should ask the user if they want to perform
//        the operation again. If the user inputs a positive response, the loop should repeat;
//        otherwise, it should terminate.


//        3.* Create class called Car with fields: type, year of production and engine capacity.
//                • Create and initialize in main() method four instances of class Car.
//                • Output result for cars:
//        o certain model year (enter year in the console);
//        o sorted cars by the field “year of production ”


//        4.** Create a program that generates a random number and prompts to the user to guess
//        what the number is. If the user's guess is higher than the random number, the program
//        should display "Too high, try again." If the user's guess is lower than the random number,
//        the program should display "Too low, try again." The program should use a loop that
//        repeats until the user correctly guesses the random number.


//    5**. Add Unit Tests to each task, publish code on GitHub.

    }
}

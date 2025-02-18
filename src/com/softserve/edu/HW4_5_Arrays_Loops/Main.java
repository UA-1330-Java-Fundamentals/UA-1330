package com.softserve.edu.HW4_5_Arrays_Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

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

        /*----------------1-------------------------*/

        System.out.println("*Input a number of anything month");
        int numOfMounth = sc.nextInt();

        System.out.println("Is there a leap year?(Yes/no)");
        String testLeap = sc.next();

        int numOfDay = TaskOne.getNumberOfDaysInMounth(numOfMounth,testLeap);

        System.out.println("Mounts #" + numOfMounth + "have " + numOfDay + "days");

        /*----------------2-------------------------*/

        System.out.println("*Enter 10 integer numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(TaskOne.sumOrProductCalculator(numbers));

        /*----------------3-------------------------*/
        System.out.println("*Enter 5 integer numbers:");

        int[] mas1 = new int[5];
        for (int i = 0; i < 5; i++) {
            mas1[i] = sc.nextInt();
        }

        int secondPositive = TaskOne.getSecondPositive(mas1);
        int poditionOfMinimslValue = TaskOne.getPoditionOfMinimslValue(mas1);
        double product = TaskOne.getProductOfPositiveNumber(mas1);


        if (secondPositive == -1) System.out.println("The array does not have a second additional number");
        else System.out.printf("Position of second positive number: %d\n", secondPositive);

        System.out.printf("Minimum value and its position in the array: value = %d, position = [%d]\n" + "Calculate the product of all entered even numbers" + "(exclude 0 from even if entered by user): product  = %f\n", mas1[poditionOfMinimslValue], poditionOfMinimslValue, product);

//        2. Create a do-while loop that prompts the user to enter two numbers and calculates their
//        sum. After displaying the result, the program should ask the user if they want to perform
//        the operation again. If the user inputs a positive response, the loop should repeat;
//        otherwise, it should terminate.


        boolean answer;

        do {
            System.out.println("*Enter 2 integer numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = TaskTwo.getSumOfTwoNumber(num1, num2);
            System.out.println("Sum = " + sum);

            System.out.println("Do you want to perform the action again?(Yes/No)");
            String answerQuestion = sc.next();

            switch (answerQuestion.toLowerCase()) {
                case "yes", "+" -> answer = true;
                default -> answer = false;
            }
        } while (answer);


//        3.* Create class called Car with fields: type, year of production and engine capacity.
//                • Create and initialize in main() method four instances of class Car.
//                • Output result for cars:
//        o certain model year (enter year in the console);
//        o sorted cars by the field “year of production ”


        Car[] cars = {new Car("Toyota Corolla", 2015, 1.8),
                        new Car("Ford Mustang", 2020, 5.0),
                        new Car("Honda Civic", 2015, 2.0),
                        new Car("BMW X5", 2018, 3.0)};

        System.out.println("Car that are available:");
        for (Car car : cars) {
            System.out.println(car);
        }

        //-----------------1-------------
        System.out.println("\nInput a year of production:");
        int yearOfProduction = sc.nextInt();
        Car[] tempCar = Car.getModelYear(cars, yearOfProduction);
        for (Car car : tempCar) {
            System.out.println(car);
        }

        //-----------------2-------------
        Car.sortCarsByYear(cars);
        System.out.println("\nAfter sorting:");
        for (Car car : cars) {
            System.out.println(car);
        }

//        4.** Create a program that generates a random number and prompts to the user to guess
//        what the number is. If the user's guess is higher than the random number, the program
//        should display "Too high, try again." If the user's guess is lower than the random number,
//        the program should display "Too low, try again." The program should use a loop that
//        repeats until the user correctly guesses the random number.

        System.out.println("Try to guess the number: ");

        System.out.println( GuessTheNumber.guessTheNumber());

//    5**. Add Unit Tests to each task, publish code on GitHub.
        //спробую  зробити пізніше ....


    }
}

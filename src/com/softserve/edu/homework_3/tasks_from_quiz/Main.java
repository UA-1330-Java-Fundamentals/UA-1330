package com.softserve.edu.homework_3.tasks_from_quiz;

public class Main {
    public static void main(String[] args) {
        //Convert the temperature
        System.out.println("87 degrees in Fahrenheit equals " + TemperatureConverter.fahrenheitToCelsius(87) + " degrees Celsius");

        //Calculate the sum of three digits
        System.out.println("The sum of 123 is " + DigitSumCalculator.calculateDigitSum(123));

        //Calculate the square root, the square anf the cube of the number
        System.out.println("\nThe square root of the number 49 is " + MathOperations.calculateSquareRoot(49) +
                "\nThe square of the number 4 is " + MathOperations.calculateSquare(4) +
                "\nThe cube of the number 2 is " + MathOperations.calculateCube(2));

        //Make deposit anf withdrawal
        BankAccount bankAccount = new BankAccount("123456", 305.67);
        bankAccount.deposit(400);

        System.out.println("\nCurrent balance: " + bankAccount.getBalance());
        bankAccount.withdraw(208);
    }
}

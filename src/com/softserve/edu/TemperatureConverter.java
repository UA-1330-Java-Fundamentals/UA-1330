package com.softserve.edu;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double InputFahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        InputFahrenheit = input.nextDouble();

        System.out.print("Celsius: " + fahrenheitToCelsius(InputFahrenheit));
    }

    public static double fahrenheitToCelsius(double Fahrenheit) {
        double Celsius;
        Celsius = (Fahrenheit - 32) * 5 / 9;

        return Celsius;
    }
}

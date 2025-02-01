package com.softserve.edu.homework3_Inrpduction_to_OOP;

/*
Create a public static method named "fahrenheitToCelsius" that converts temperatures from Fahrenheit to Celsius.
The method should take one argument, the temperature in degrees Fahrenheit (as a double), and return its
equivalent in degrees Celsius (also as a double).
 */

import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double degreesInFahrenheit){
        return (degreesInFahrenheit - 32)*((double) 5 /9);
    }


    public static void main(String[] args) {

        TemperatureConverter t1 = new TemperatureConverter();
        System.out.println(t1.fahrenheitToCelsius(100));
    }
}

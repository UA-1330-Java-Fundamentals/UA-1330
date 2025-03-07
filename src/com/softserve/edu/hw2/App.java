package com.softserve.edu.hw2;

public class App {

    public static void main(String[] args) {
        Double num = 16.0;
        MathOperations mathOperations = new MathOperations();
        Double v = mathOperations.calculateSquareRoot(num);
        System.out.println(v);
    }
}

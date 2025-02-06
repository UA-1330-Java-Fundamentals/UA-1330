package com.softserve.edu.ConditionalStatements;

public class CoffeeMachine {
    enum CoffeeType {
        ESPRESSO, AMERICANO, CAPPUCCINO, LATTE;
    }

    public static void displayCoffeeChoice(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO:
                System.out.println("You have chosen Espresso. Enjoy your strong coffee!");
                break;
            case AMERICANO:
                System.out.println("You have chosen Americano. Enjoy your smooth coffee!");
                break;
            case CAPPUCCINO:
                System.out.println("You have chosen Cappuccino. Enjoy your coffee with milk foam!");
                break;
            case LATTE:
                System.out.println("You have chosen Latte. Enjoy your creamy coffee!");
                break;
        }
    }
}
package com.softserve.edu.finalProject;

public enum CoffeeType {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    public final int water;
    public final int milk;
    public final int beans;
    public final int price;

    CoffeeType(int water, int milk, int beans, int price) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.price = price;
    }

    public static CoffeeType from(String input) {
        return switch (input) {
            case "1" -> ESPRESSO;
            case "2" -> LATTE;
            case "3" -> CAPPUCCINO;
            default -> null;
        };
    }
}

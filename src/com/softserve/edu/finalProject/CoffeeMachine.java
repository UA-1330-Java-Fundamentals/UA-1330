package com.softserve.edu.finalProject;

import java.util.Scanner;

public class CoffeeMachine {

    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;
    private int madeCupsAfterClean = 0;
    private static final int MAXALLOWEDCUPSTILLCLEAN = 10;

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.coffeeMachineOperation();
    }

    public void coffeeMachineOperation() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, clean, exit):");
            String input = sc.next();
            InputAction action = InputAction.from(input);

            if (action == null) {
                System.out.println("Unknown action");
                continue;
            }

            switch (action) {
                case BUY -> buy(sc);
                case FILL -> fill(sc);
                case TAKE -> take();
                case REMAINING -> remaining();
                case CLEAN -> clean();
                case EXIT -> {
                    return;
                }
            }
        }
    }

    private void buy(Scanner sc) {
        if (needsCleaning()) {
            System.out.println("I need cleaning!");
            return;
        }

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = sc.next();

        if ("back".equalsIgnoreCase(input)) {
            return;
        }

        CoffeeType type = CoffeeType.from(input);
        if (type == null) {
            System.out.println("Unknown coffee type");
            return;
        }

        if (!hasEnoughResources(type)) {
            return;
        }

        System.out.println("I have enough resources, making you a coffee!");
        water -= type.water;
        milk -= type.milk;
        beans -= type.beans;
        cups--;
        money += type.price;
        madeCupsAfterClean++;
    }

    private boolean hasEnoughResources(CoffeeType type) {
        if (water < type.water) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (milk < type.milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (beans < type.beans) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }
        return true;
    }

    private void fill(Scanner sc) {
        System.out.println("Write how many ml of water you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        cups += sc.nextInt();
    }

    private void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private boolean needsCleaning() {
        return madeCupsAfterClean >= MAXALLOWEDCUPSTILLCLEAN;
    }

    private void clean() {
        madeCupsAfterClean = 0;
        System.out.println("I have been cleaned!");
    }
}

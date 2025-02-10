package ConditionalStataments_HW;

public class CofeeMachine {
    public enum CoffeeType {
        ESPRESSO, AMERICANO, CAPPUCCINO, LATTE
    }

    // Method to display coffee choice
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
            default:
                System.out.println("Unknown coffee type selected.");
        }
    }

}

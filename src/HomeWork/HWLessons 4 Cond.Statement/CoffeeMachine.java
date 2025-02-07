public class CoffeeMachine {
    enum CoffeeType {
        ESPRESSO, AMERICANO, CAPPUCCINO, LATTE;
    }

    public static void displayCoffeeChoice(CoffeeType type) {
        switch (type) {
            case CoffeeType.ESPRESSO -> System.out.println("You have chosen Espresso. Enjoy your strong coffee!");
            case CoffeeType.AMERICANO -> System.out.println("You have chosen Americano. Enjoy your smooth coffee!");
            case CoffeeType.CAPPUCCINO ->
                    System.out.println("You have chosen Cappuccino. Enjoy your coffee with milk foam!");
            case CoffeeType.LATTE -> System.out.println("You have chosen Latte. Enjoy your creamy coffee!");
            default -> System.out.println("unknown coffee types");
        }
    }

    public static void main(String[] args) {
        CoffeeType type = CoffeeType.AMERICANO;
        displayCoffeeChoice(type);

    }
}

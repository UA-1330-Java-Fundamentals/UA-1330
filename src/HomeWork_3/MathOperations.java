package HomeWork_3;

public class MathOperations {

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }


    public static double calculateSquare(double number) {
        return number * number;
    }


    public static double calculateCube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        double number = 12;


        System.out.println("Square root of " + number + " is: " + calculateSquareRoot(number));
        System.out.println("Square of " + number + " is: " + calculateSquare(number));
        System.out.println("Cube of " + number + " is: " + calculateCube(number));
    }
}


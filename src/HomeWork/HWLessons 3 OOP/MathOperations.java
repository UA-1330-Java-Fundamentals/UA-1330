import java.lang.Math;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        double number = getNumber();
        double squareRoot = calculateSquareRoot(number);
        double square = calculateSquare(number);
        double cube = calculateCube(number);
        System.out.println("calculateSquareRoot = " + squareRoot);
        System.out.println("calculateSquare = " + square);
        System.out.println("calculateCube = " + cube);
    }

    public static int getNumber() {
        System.out.println("Your number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static double calculateSquareRoot(double number) {
        return (double) Math.sqrt(number);
    }

    public static double calculateSquare(double number) {
        return (double) number * number;
    }

    public static double calculateCube(double number) {
        return (double) number * number * number;
    }
}

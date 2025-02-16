package com.softserve.edu.less2.task1;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Class Triangle is designed to calculate the perimeter and area of a triangle
 */
public class Triangle {//may be TriangleUtils or TriangleCalculator
    /**
     * Calculate the perimeter of a triangle
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return perimeter of the triangle
     */
    public static double calculatePerimeter(double side1, double side2, double side3) {
        if (isTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Not a triangle");
        }
        return side1 + side2 + side3;
    }

    /**
     * Calculate the area of a triangle
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return area of the triangle
     */
    public static double calculateArea(double side1, double side2, double side3) {
        if (isTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Not a valid triangle");
        }
        double semiPerimeter = calculatePerimeter(side1, side2, side3) / 2;
        return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    /**
     * Check if the sides can form a triangle
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return true if the sides can form a triangle
     */
    private static boolean isTriangle(double side1, double side2, double side3) {
        return (!(side1 + side2 > side3)) || (!(side1 + side3 > side2)) || (!(side2 + side3 > side1));
    }

    /**
     * Prompt the user to enter a positive side length
     * @param scanner scanner to read input
     * @return side length
     */
    public static double promptParameters(Scanner scanner) {
        System.out.print("Please enter a positive side length: ");
        double side = scanner.nextDouble();
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0.");
        }
        return side;
    }
}

class TriangleTest {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double side1 = Triangle.promptParameters(SCANNER);
        double side2 = Triangle.promptParameters(SCANNER);
        double side3 = Triangle.promptParameters(SCANNER);
        System.out.println("Perimeter = " + Triangle.calculatePerimeter(side1, side2, side3));
        System.out.println("Area = " + Triangle.calculateArea(side1, side2, side3));
    }
}

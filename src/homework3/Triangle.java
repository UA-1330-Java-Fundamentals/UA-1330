package homework3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1:");
        int side1 = scanner.nextInt();
        System.out.println("Input Side 2:");
        int side2 = scanner.nextInt();
        System.out.println("Input Side 3:");
        int side3 = scanner.nextInt();

        System.out.println("The area of the triangle is %.2f".formatted(areaOfTriangle(side1, side2, side3)));
    }

    public static double areaOfTriangle(double side1, double side2, double side3){
        double semiPerimeter;
        semiPerimeter = (side1 + side2 + side3)/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }


}

package com.softserve.edu.HW2;

import static com.softserve.edu.Students.Main.SCANNER;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public boolean isTriangleValid() {
        return (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1;
    }

    public double getTriangleArea() {
        double hp = ((side1 + side2 + side3) * 1.0) / 2;
        return Math.sqrt(hp * (hp - side1) * (hp - side2) * (hp - side3));
    }

    public static void promptSides(Triangle triangle) {
        // метод запитування у клієнта сторін трикутника
        System.out.println("Input side 1: ");
        int side1 = SCANNER.nextInt();
        triangle.setSide1(side1);

        System.out.println("Input side 2: ");
        int side2 = SCANNER.nextInt();
        triangle.setSide2(side2);

        System.out.println("Input side 3: ");
        int side3 = SCANNER.nextInt();
        triangle.setSide3(side3);

    }
}









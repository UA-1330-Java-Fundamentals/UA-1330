package com.softserve.edu.HW2;//пакет повинен бути з маленької літери (com.softserve.edu.hw2)

public class TriangleFormulas {
    //here better have a static method calculateArea, which will return the area of the triangle
    public static double calculateArea(double side1, double side2, double side3) {
        if(isTriangle(side1, side2, side3)) {
            System.out.println("The sides do not form a triangle");
        }
        double s = calculatePerimeter(side1, side2, side3) / 2; //назва змінної повинна бути більш зрозумілою (наприклад, semiPerimeter)
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double calculatePerimeter(double side1, double side2, double side3) {
        if(isTriangle(side1, side2, side3)) {
            System.out.println("The sides do not form a triangle");
        }
        return side1 + side2 + side3;
    }

   private static boolean isTriangle(double side1, double side2, double side3) {
        return !(side1 + side2 > side3) || !(side1 + side3 > side2) || !(side2 + side3 > side1);
    }

    private double side1, side2, side3, area;

    public TriangleFormulas(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        calculateArea();

    }

    public void calculateArea() {

        double a = this.side1;
        double b = this.side2;
        double c = this.side3;

        double s = (a + b + c) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "The area of thr triangle is " + area;
    }
}

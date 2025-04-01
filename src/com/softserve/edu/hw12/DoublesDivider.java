package com.softserve.edu.hw12;

public class DoublesDivider {

    public static double div(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        try {
            double a = Double.parseDouble("99");
            double b = 0;
            System.out.println(div(a, b));
        }
        catch (NumberFormatException e) {
            System.out.println("The entered number is not a double");
        }
        catch (Exception exception) {
            System.out.println("There is an error");
        }
    }
}

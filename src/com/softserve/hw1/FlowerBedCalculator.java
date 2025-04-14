package com.softserve.hw1;
import java.util.Scanner;
import java.math.*;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the flower bed radius integer value:");
        int radius = sc.nextInt();

        float perimeter = (float) (2 * Math.PI * radius);
        float area = (float) (Math.PI * radius * radius);


        System.out.printf("Your flower bed perimeter is: %.2f \n", perimeter);
        System.out.printf("Your flower bed area is: %.2f", area);

        sc.close();
    }
}

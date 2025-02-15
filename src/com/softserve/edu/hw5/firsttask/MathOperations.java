package com.softserve.edu.hw5.firsttask;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        array[0] = sc.nextInt();
        System.out.print("Enter the second number ");
        array[1] = sc.nextInt();
        System.out.print("Enter the third number ");
        array[2] = sc.nextInt();
        System.out.print("Enter the fourth number ");
        array[3] = sc.nextInt();
        System.out.print("Enter the fifth number ");
        array[4] = sc.nextInt();
        System.out.print("Enter the sixth number ");
        array[5] = sc.nextInt();
        System.out.print("Enter the seventh number ");
        array[6] = sc.nextInt();
        System.out.print("Enter the eighth number ");
        array[7] = sc.nextInt();
        System.out.print("Enter the ninth number ");
        array[8] = sc.nextInt();
        System.out.print("Enter the tenth number ");
        array[9] = sc.nextInt();
        sc.close();
        System.out.println("The sum/product of the numbers are: " + calculator(array));
    }

    public static int calculator(int[] a) {
        if (a[0] > 0 && a[1] > 0 && a[2] > 0 && a[3] > 0 && a[4] > 0) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += a[i];
            } return sum;

        } else if (a[0] <= 0 || a[1] <= 0 || a[2] <= 0 || a[3] <= 0 || a[4] <= 0) {
            int product = 1;
            for (int i = 5; i < a.length; i++) {
                product = product * a[i];
            } return product;
        }
        return 0;
    }
}

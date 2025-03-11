package homework4;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer number: ");
        int num3 = scanner.nextInt();



        System.out.println("Maximum value: " + Math.max(num1, Math.max(num2,num3)));

        System.out.println("Minimum value: " + Math.min(num1, Math.min (num2,num3)));

    }
}

package com.softserve.hw1;
import java.util.Scanner;

public class PresentationTask1 {
    public static void main(String[] args) {
        String line1,line2, line3;

        Scanner sc = new Scanner(System.in);
        System.out.println("This task outputs lines in reverse order");
        System.out.print("Enter first line: ");
        line1  = sc.nextLine();

        System.out.print("Enter second line:");
        line2 = sc.nextLine();

        System.out.print("Enter third line:");
        line3 = sc.nextLine();

        System.out.printf("Entered lines in reverse order: \n %s\n %s\n %s",line3, line2,line1);

        sc.close();
    }
}
